package com.example.bmi

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var wide=findViewById<EditText>(R.id.wide)
        var high=findViewById<EditText>(R.id.high)
        var cal1=findViewById<Button>(R.id.cal1)

        var equa1=findViewById<TextView>(R.id.equa1)
        var equa2=findViewById<TextView>(R.id.equa2)

        var movep=findViewById<Button>(R.id.movep)

        var exit1=findViewById<Button>(R.id.exit1)

        var cre=findViewById<Button>(R.id.cre)
        var mus=findViewById<Button>(R.id.mus)


        cal1.setOnClickListener{

            try {
                var wides=wide?.text.toString().toDouble()
                var highs=high?.text.toString().toDouble()
                var bmis=wides/((highs/100)*(highs/100))
                Log.v("BMI",bmis.toString())
                equa1.text="BMI= $bmis"
                if(bmis<=18.5){
                    equa2.text="${resources.getString(R.string.a181)}"

                }else if (bmis<=24){
                    equa2.text="${resources.getString(R.string.a241)}"

                }else if (bmis<=29){
                    equa2.text="${resources.getString(R.string.a251)}"

                }else if (bmis>=30){
                    equa2.text="${resources.getString(R.string.a301)}"

                }


            }catch (e:NumberFormatException){
                equa1.text="Invalid input"
            }
        }

        movep.setOnClickListener{
            var move2 = Intent(this,Page2::class.java )
            startActivity(move2)
        }
        cre.setOnClickListener{
            var cre1 = Intent(this,Creater::class.java )
            startActivity(cre1)
        }

        exit1.setOnClickListener {
            moveTaskToBack(true);
            exitProcess(-1)
        }
        var music:MediaPlayer=MediaPlayer.create(this, R.raw.fredji)
        mus.setOnClickListener {
            if (!music.isPlaying){
                music.start()
            }else {
                music.pause()
            }
        }
        repeat(3){
            println("Cal MBI Confirm")
        }



    }
}