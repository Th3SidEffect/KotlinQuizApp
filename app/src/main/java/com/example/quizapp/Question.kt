package com.example.quizapp

data class Question(
    val number: Int,
    val question: String,
    val options: List<String>,
    val correctAnswer: Int
)