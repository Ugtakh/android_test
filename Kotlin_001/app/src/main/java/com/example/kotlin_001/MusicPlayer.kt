package com.example.kotlin_001

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton

class MusicPlayer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music_player)

        val mediaPlayer : MediaPlayer = MediaPlayer.create(this, R.raw.how_deep_is_your_love)

        val play = findViewById<ImageButton>(R.id.play_btn)
        val prev = findViewById<ImageButton>(R.id.prev_btn)
        val next = findViewById<ImageButton>(R.id.next_btn)

        play.setOnClickListener{
            if(!mediaPlayer.isPlaying){
                mediaPlayer.start()
                play.setImageResource(R.drawable.ic_baseline_pause_circle_outline_24)
                Log.d("Music", "Start")
            }else{
                mediaPlayer.pause()
                play.setImageResource(R.drawable.ic_baseline_play_circle_outline_24)
                Log.d("Music", "Pause")
            }
        }

    }
}