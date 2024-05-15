package com.example.counterviewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel:ViewModel(){
    private var _count: MutableState<Int> = mutableStateOf(0)
    val count: MutableState<Int>
        get() = _count

    fun increment(){
        _count.value++
    }
    fun decrement(){
        _count.value--
    }
}