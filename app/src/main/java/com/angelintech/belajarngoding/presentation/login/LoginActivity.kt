package com.angelintech.belajarngoding.presentation.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.angelintech.belajarngoding.R
import com.angelintech.belajarngoding.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var loginBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginBinding.root)
    }
}