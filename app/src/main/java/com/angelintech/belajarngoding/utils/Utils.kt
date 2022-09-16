package com.angelintech.belajarngoding.utils

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.angelintech.belajarngoding.databinding.LayoutDialogErrorBinding
import com.angelintech.belajarngoding.databinding.LayoutDialogLoadingBinding
import com.angelintech.belajarngoding.databinding.LayoutDialogSuccessBinding

fun View.visible(){ visibility = View.VISIBLE }
fun View.gone(){ visibility = View.GONE }
fun View.enabled(){ isEnabled = true }
fun View.disabled(){ isEnabled = false }

fun showDialogLoading(context: Context):AlertDialog{
    val binding = LayoutDialogLoadingBinding.inflate(LayoutInflater.from(context))
    return AlertDialog
        .Builder(context)
        .setView(binding.root)
        .setCancelable(false)
        .create()
}

fun showDialogSuccess(context: Context, message: String):AlertDialog{
    val binding = LayoutDialogSuccessBinding.inflate(LayoutInflater.from(context))
    binding.tvMessage.text = message

    return AlertDialog
        .Builder(context)
        .setView(binding.root)
        .setCancelable(true)
        .create()
}

fun showDialogError(context: Context, message: String){
    val binding = LayoutDialogErrorBinding.inflate(LayoutInflater.from(context))
    binding.tvMessage.text = message

    AlertDialog
        .Builder(context)
        .setView(binding.root)
        .setCancelable(true)
        .create()
        .show()
}