package com.rajendra.quizapp.module

import android.app.Application
import androidx.room.Room
import com.rajendra.quizapp.constants.Constants.DB_NAME
import com.rajendra.quizapp.dao.IQuizDAO
import com.rajendra.quizapp.dao.QuizDAO
import com.rajendra.quizapp.database.QuizDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideQuizDatabase(context: Application): QuizDatabase {
        return Room.databaseBuilder(
            context,
            QuizDatabase::class.java,
            DB_NAME
        ).build()
    }

    @Singleton
    @Provides
    fun provideQuizRepository(db: QuizDatabase): IQuizDAO {
        return QuizDAO(db)
    }

}