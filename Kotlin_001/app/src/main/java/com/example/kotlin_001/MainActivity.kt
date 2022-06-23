package com.example.kotlin_001

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnNext = findViewById<Button>(R.id.btnNext)
        val btnColorText = findViewById<Button>(R.id.colorText)
        val gotoMusicPlayer = findViewById<Button>(R.id.musicPlayer)
        val gotoVideoPlayer = findViewById<Button>(R.id.videoPlayer)

        btnNext.setOnClickListener{
            Log.d("log","Clicked")

            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        };

        btnColorText.setOnClickListener{
            val intent = Intent(this,Colortext::class.java)
            startActivity(intent)
        }

        gotoMusicPlayer.setOnClickListener{
            val intent = Intent(this,MusicPlayer::class.java)
            startActivity(intent)
        }

        gotoVideoPlayer.setOnClickListener{
            val intent = Intent(this,Video_Player::class.java)
            startActivity(intent)
        }
    }
}