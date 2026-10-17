package com.example.quizapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quizapp.ui.theme.QuizAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuizAppTheme {
                QuizScreen()
            }
        }
    }
}

@Composable
fun QuizScreen() {
    val answers = remember {
        mutableStateListOf<Int?>().apply {
            repeat(quizQuestions.size) {
                add(null)
            }
        }
    }

    var score by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(8.dp)
    ) {

        quizQuestions.forEachIndexed { index, question ->

            QuestionCard(
                question = question,
                selectedAnswer = answers[index],
                onAnswerSelected = { selectedOption ->
                    answers[index] = selectedOption
                }
            )
        }

        Text(text = "Score : ${score}")

        Button({
            answers.forEachIndexed { index, answer ->
                if(answer == null) {
                    score += 0
                }
                else if(answer == quizQuestions[index].correctAnswer){
                    score += 1
                }
            }
        }) {
            Text(text = "Submit")
        }
    }
}