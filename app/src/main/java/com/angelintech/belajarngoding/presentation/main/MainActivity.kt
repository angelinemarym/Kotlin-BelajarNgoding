package com.angelintech.belajarngoding.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.angelintech.belajarngoding.R
import com.angelintech.belajarngoding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
    }
}