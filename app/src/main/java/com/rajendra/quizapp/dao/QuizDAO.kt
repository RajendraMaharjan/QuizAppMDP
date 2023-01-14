package com.rajendra.quizapp.dao

import com.rajendra.quizapp.model.Quiz
import com.rajendra.quizapp.model.QuizDAO
import com.rajendra.quizapp.database.QuizDatabase
import javax.inject.Inject

class QuizDAO @Inject constructor(
    private val db: QuizDatabase
) : IQuizDAO {

    private var quizDao: QuizDAO = db.quizDAO

    override suspend fun insertQuizQuestions(quizList: MutableList<Quiz>) {
        quizDao.insertQuizQuestions(quizList)
    }

    override suspend fun insertQuiz(quiz: Quiz) {
        quizDao.insertQuiz(quiz)
    }

    override suspend fun getQuizList(): MutableList<Quiz> {
        return quizDao.getQuizList()
    }

    override suspend fun resetQuestionSet() {
        db.clearAllTables()
    }

}