package com.angelintech.belajarngoding.presentation.changepassword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.angelintech.belajarngoding.R
import com.angelintech.belajarngoding.databinding.ActivityChangePasswordBinding

class ChangePasswordActivity : AppCompatActivity() {
    private lateinit var changePasswordBinding: ActivityChangePasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        changePasswordBinding = ActivityChangePasswordBinding.inflate(layoutInflater)
        setContentView(changePasswordBinding.root)
    }
}