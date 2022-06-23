package com.example.kotlin_001

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var arrayAdapter : ArrayAdapter<*>;
        val users  = arrayOf("User1","User2", "User3")

        val prev = findViewById<Button>(R.id.btnPrev)
        val list = findViewById<ListView>(R.id.listView1)



        prev.setOnClickListener{
            arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, users)
            list.setAdapter(arrayAdapter)
            Log.d("log", "hah")
        }


    }
}