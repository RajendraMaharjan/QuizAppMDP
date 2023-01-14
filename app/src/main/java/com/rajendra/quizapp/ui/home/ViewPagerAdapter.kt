package com.rajendra.quizapp.ui.home

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.rajendra.quizapp.constants.Constants.IS_CHECK_BOX
import com.rajendra.quizapp.constants.Constants.IS_RADIO_BUTTON
import com.rajendra.quizapp.model.Quiz
import com.rajendra.quizapp.ui.checkboxquestions.CheckBoxQuestionFragment
import com.rajendra.quizapp.ui.radiobuttonquestions.RadioButtonQuestionFragment
import com.rajendra.quizapp.ui.result.ResultFragment
import com.google.gson.Gson

class ViewPagerAdapter(
    fragment: Fragment,
    private val questionList: List<Quiz>
) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = questionList.size + 1

    override fun createFragment(position: Int): Fragment {
        val fragment: Fragment = if (position == 15) {
            ResultFragment.newInstance()
        }else {
            val quiz = questionList[position]
            //creating fragment object according to position
            when(quiz.questionType) {

                IS_CHECK_BOX -> CheckBoxQuestionFragment.newInstance(Gson().toJson(quiz))

                IS_RADIO_BUTTON -> RadioButtonQuestionFragment.newInstance(Gson().toJson(quiz))

                else -> ResultFragment.newInstance()
            }
        }

        return fragment
    }

}