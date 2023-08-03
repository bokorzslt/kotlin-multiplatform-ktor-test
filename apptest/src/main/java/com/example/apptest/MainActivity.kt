package com.example.apptest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import ktortest.Greeting
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        performRequest()
    }

    private fun performRequest() {
        lifecycleScope.launch {
            Log.d(MainActivity::class.java.simpleName, Greeting().greeting())
        }
    }
}