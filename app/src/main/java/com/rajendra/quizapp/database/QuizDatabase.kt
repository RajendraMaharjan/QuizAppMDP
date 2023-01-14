package com.rajendra.quizapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.rajendra.quizapp.model.Quiz
import com.rajendra.quizapp.model.QuizDAO
import com.rajendra.quizapp.util.Converter

@Database(
    entities = [Quiz::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converter::class)
abstract class QuizDatabase : RoomDatabase() {
    abstract val quizDAO: QuizDAO
}