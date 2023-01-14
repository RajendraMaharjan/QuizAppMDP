package com.rajendra.quizapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rajendra.quizapp.model.Quiz
import com.rajendra.quizapp.dao.QuizDAO
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AnswerViewModel @Inject constructor(
    private val repository: QuizDAO
) : ViewModel() {

    private val _data: MutableLiveData<List<Quiz>> = MutableLiveData()
    val data: LiveData<List<Quiz>> = _data

    init {
        loadData()
    }

    private fun loadData() {
        viewModelScope.launch(Dispatchers.IO) {
            _data.postValue(repository.getQuizList())
        }
    }

    fun resetDatabase(newList: MutableList<Quiz>) {
        viewModelScope.launch(Dispatchers.IO) {
            _data.postValue(newList)
        }
    }
}