package com.example.android.guesstheword.screens.score

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ScoreViewModel(var finalScore: Int) : ViewModel() {

    class Factory(private var finalScore: Int) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(ScoreViewModel::class.java)) {
                return ScoreViewModel(finalScore) as T
            }
            throw IllegalArgumentException("Unknown viewModel class")
        }

    }
}