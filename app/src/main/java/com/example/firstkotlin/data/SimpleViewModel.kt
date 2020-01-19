package com.example.firstkotlin.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SimpleViewModel : ViewModel() {
    private val _counter = MutableLiveData(0)
    private val _toastButton = MutableLiveData("Toast")
    private val _countButton = MutableLiveData("Count")
    private val _randomButton = MutableLiveData("Random")

    var counter: LiveData<Int> = _counter
    val toastButton: LiveData<String> = _toastButton
    val countButton: LiveData<String> = _countButton
    val randomButton: LiveData<String> = _randomButton

    fun countMe() {
        _counter.value = (_counter.value ?: 0) + 1
    }
}