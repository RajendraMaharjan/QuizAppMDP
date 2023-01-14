package com.rajendra.quizapp.util

import com.rajendra.quizapp.model.AnswerModel

interface ICheckClick {
    fun onCheckBoxChecked(answerModel: AnswerModel)
    fun onCheckBoxUnChecked(answerModel: AnswerModel)
}