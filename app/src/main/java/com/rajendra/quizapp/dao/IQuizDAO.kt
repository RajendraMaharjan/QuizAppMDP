package com.rajendra.quizapp.dao

import com.rajendra.quizapp.model.Quiz

interface IQuizDAO {
    suspend fun insertQuizQuestions(quizList : MutableList<Quiz>)
    suspend fun insertQuiz(quiz: Quiz)
    suspend fun getQuizList(): MutableList<Quiz>
    suspend fun resetQuestionSet()
}