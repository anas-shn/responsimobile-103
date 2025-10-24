package com.example.responsi1mobileh1d023103.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.responsi1mobileh1d023103.data.model.Squad
import com.example.responsi1mobileh1d023103.data.network.RetrofitInstance
import kotlinx.coroutines.launch

class PlayerViewModel : ViewModel() {
    private val _players = MutableLiveData<List<Squad>>()
    val players: LiveData<List<Squad>> = _players

    fun fetchPlayers() {
        viewModelScope.launch {
            try {
                val response = RetrofitInstance().api.getData()
                if (response.isSuccessful) {
                    _players.postValue(response.body()?.squad.orEmpty())
                } else {
                    _players.postValue(emptyList())
                }
            } catch (e: Exception) {
                _players.postValue(emptyList())
            }
        }
    }
}