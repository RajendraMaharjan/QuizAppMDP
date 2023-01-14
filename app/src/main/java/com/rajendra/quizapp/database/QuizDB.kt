package com.rajendra.quizapp.database

import android.content.Context
import androidx.room.Room
import com.rajendra.quizapp.constants.Constants
import com.rajendra.quizapp.model.QuizDAO

class QuizDB(context: Context) {

    private var quizDatabase: QuizDatabase = Room.databaseBuilder(
        context,
        QuizDatabase::class.java,
        Constants.DB_NAME
    ).build()

    fun getQuizDAO(): QuizDAO = quizDatabase.quizDAO
}