package com.rajendra.quizapp.ui.result

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.rajendra.quizapp.R
import com.rajendra.quizapp.model.Quiz
import com.rajendra.quizapp.databinding.ItemResultAnalysisBinding
import com.rajendra.quizapp.util.DiffUtilCallbackImpl

class ResultAnalysisAdapter(
    private val quizList: MutableList<Quiz> = mutableListOf()
): RecyclerView.Adapter<ResultAnalysisAdapter.ResultAnalysisViewHolder>() {

    inner class ResultAnalysisViewHolder(private val binding: ItemResultAnalysisBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(quiz: Quiz) {
            binding.quiz = quiz
        }
    }

    fun updateList(newList: List<Quiz>) {
        val result = DiffUtil.calculateDiff(DiffUtilCallbackImpl(quizList, newList))
        quizList.clear()
        quizList.addAll(newList)
        result.dispatchUpdatesTo(this)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultAnalysisViewHolder {
        val binding = ItemResultAnalysisBinding.bind(LayoutInflater.from(parent.context).inflate(R.layout.item_result_analysis, parent, false))
        return ResultAnalysisViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ResultAnalysisViewHolder, position: Int) {
        holder.bind(quizList[position])
    }

    override fun getItemCount(): Int = quizList.size
}