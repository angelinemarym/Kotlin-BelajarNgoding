package com.angelintech.belajarngoding.presentation.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.angelintech.belajarngoding.R
import com.angelintech.belajarngoding.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var registerBinding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerBinding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(registerBinding.root)
    }
}