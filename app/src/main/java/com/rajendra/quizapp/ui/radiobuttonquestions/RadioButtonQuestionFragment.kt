package com.rajendra.quizapp.ui.radiobuttonquestions

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.rajendra.quizapp.R
import com.rajendra.quizapp.model.Quiz
import com.rajendra.quizapp.databinding.FragmentRadioButtonQuestionBinding
import com.rajendra.quizapp.viewmodel.QuizViewModel
import com.rajendra.quizapp.util.RadioClickInterface
import com.google.gson.Gson
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RadioButtonQuestionFragment : Fragment(R.layout.fragment_radio_button_question),
    RadioClickInterface {
    private lateinit var quiz: Quiz
    private lateinit var viewModel: QuizViewModel
    private lateinit var binding: FragmentRadioButtonQuestionBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getArgumentsData()
        initSetup(view)
    }

    private fun initSetup(view: View) {
        binding = FragmentRadioButtonQuestionBinding.bind(view)
        viewModel = ViewModelProvider(requireActivity())[QuizViewModel::class.java]

        binding.questionTextView.text = quiz.question

        //initializing recycler view
        val adapter = RBQuestionAdapter(quiz.options, this)
        binding.optionsRecyclerView.adapter = adapter
    }

    override fun onRadioButtonClicked(optionPosition: Int, userAnswerDesc: String) {
        quiz.userAnswer = when (optionPosition) {
            0 -> "a"
            1 -> "b"
            2 -> "c"
            3 -> "d"
            else -> ""
        }
        quiz.userAnswerDesc = userAnswerDesc
        viewModel.saveUserAnswer(quiz)
    }

    private fun getArgumentsData() {
        arguments?.let {
            quiz = Gson().fromJson(it.getString("quiz"), Quiz::class.java)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(quiz: String) = RadioButtonQuestionFragment().apply {
            arguments = Bundle().apply {
                putString("quiz", quiz)
            }
        }
    }
}