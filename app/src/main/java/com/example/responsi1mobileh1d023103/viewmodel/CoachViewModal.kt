package com.example.responsi1mobileh1d023103.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.responsi1mobileh1d023103.data.model.Coach
import com.example.responsi1mobileh1d023103.data.network.RetrofitInstance
import kotlinx.coroutines.launch

class CoachViewModal : ViewModel() {

    private val _coach = MutableLiveData<Coach?>()
    val coach: LiveData<Coach?> = _coach

    fun fetchCoach() {
        viewModelScope.launch {
            try {
                val response = RetrofitInstance().api.getData()
                if (response.isSuccessful) {
                    _coach.postValue(response.body()?.coach)
                } else {
                    _coach.postValue(null)
                }
            } catch (e: Exception) {
                _coach.postValue(null)
            }
        }
    }
}