package com.example.kotlinrevison.ui.KOTLIN.Coroutines

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlinrevison.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class KotlinCoroutines : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

            GlobalScope.launch {
                delay(3000L)
                Log.d(TAG, "onCreate: Coroutines says hello from thread " +
                        "${Thread.currentThread().name}")
            }

            GlobalScope.launch {
                delay(5000L)
                Log.d(TAG, "Hello Coroutines " +
                        "${Thread.currentThread().name}")
            } as WindowInsetsCompat
        }
    }
