package com.zcdev.stateflowkotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
     private lateinit var  timerViewModel:TimeViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     timerViewModel=ViewModelProvider(this).get(TimeViewModel::class.java)

        timerViewModel.setTime()


        runBlocking {
            timerViewModel.TimerStateFlow.collect{
            txtTimer.text=it.toString()
              Log.d("here",it.toString())
            }
        }




    }
}