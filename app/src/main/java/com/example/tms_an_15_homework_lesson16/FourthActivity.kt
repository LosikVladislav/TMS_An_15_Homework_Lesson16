package com.example.tms_an_15_homework_lesson16

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
    }

    fun startFifthAct(view: View){
        val intent = Intent(this, FifthActivity::class.java)
        startActivity(intent)
    }
}