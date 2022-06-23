package com.example.kotlin_001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.MediaController
import android.widget.VideoView

class Video_Player : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_player)

        val video = findViewById<VideoView>(R.id.videoView)

        video.setMediaController(MediaController(this))
        video.setVideoPath("android.resource://"+packageName+"/"+R.raw.minii_ayalsan_1000_hot)
        video.start()


    }
}