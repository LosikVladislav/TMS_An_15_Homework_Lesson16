package com.example.tms_an_15_homework_lesson16

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SixthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sixth)
    }

    fun comeBack(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}