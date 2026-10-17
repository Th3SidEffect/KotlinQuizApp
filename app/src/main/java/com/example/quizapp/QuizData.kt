package com.example.quizapp

val quizQuestions = listOf(
    Question(
        number = 1,
        question = "What does HTML stand for?",
        options = listOf(
            "Hyperlinks and Text Markup Language",
            "Hyper Text Markup Language",
            "Home Tool Markup Language",
            "Hyper Text Management Language"
        ),
        correctAnswer = 1
    ),

    Question(
        number = 2,
        question = "Which HTML tag is used to create a top-level heading?",
        options = listOf(
            "<heading>",
            "<h6>",
            "<h1>",
            "<head>"
        ),
        correctAnswer = 2
    ),

    Question(
        number = 3,
        question = "Which CSS property is used to change the background color of an element?",
        options = listOf(
            "color",
            "background-color",
            "bgcolor",
            "canvas-color"
        ),
        correctAnswer = 1
    ),

    Question(
        number = 4,
        question = "How do you write \"Hello World\" in an alert box in JavaScript?",
        options = listOf(
            "alert(\"Hello World\");",
            "msgBox(\"Hello World\");",
            "console.log(\"Hello World\");",
            "alertBox(\"Hello World\");"
        ),
        correctAnswer = 0
    ),

    Question(
        number = 5,
        question = "Which symbol is used to select an element by its ID in CSS?",
        options = listOf(
            ". (dot)",
            "# (hash)",
            "* (asterisk)",
            "@ (at sign)"
        ),
        correctAnswer = 1
    )
)