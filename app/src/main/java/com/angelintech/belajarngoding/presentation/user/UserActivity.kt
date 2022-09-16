package com.angelintech.belajarngoding.presentation.user

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.angelintech.belajarngoding.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {
    private lateinit var userBinding: ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        userBinding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(userBinding.root)
    }
}