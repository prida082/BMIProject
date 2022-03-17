package com.example.bmi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        var back1=findViewById<Button>(R.id.back1)

        back1.setOnClickListener{
            var back1 = Intent(this,MainActivity::class.java )
            startActivity(back1)
        }
    }
}