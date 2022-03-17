package com.example.bmi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Creater : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creater)

        var back=findViewById<Button>(R.id.back)

        back.setOnClickListener{
            var back10 = Intent(this,MainActivity::class.java )
            startActivity(back10)
        }
    }
}