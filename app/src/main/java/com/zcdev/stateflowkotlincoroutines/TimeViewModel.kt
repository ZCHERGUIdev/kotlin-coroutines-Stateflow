package com.zcdev.stateflowkotlincoroutines

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.runBlocking

class TimeViewModel:ViewModel() {
    var _TimerStateFlow=MutableStateFlow<Int>(0)
    var TimerStateFlow=_TimerStateFlow




    fun setTime(){
        runBlocking {
            for(i in 1..10){
                _TimerStateFlow.value=i
                delay(1000)
            }
        }

    }

}