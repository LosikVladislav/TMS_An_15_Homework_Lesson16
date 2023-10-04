package com.example.tms_an_15_homework_lesson16

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    fun startThirdAct(view: View){
        val intent = Intent(this, ThirdActivity::class.java)
        startActivity(intent)
    }
}