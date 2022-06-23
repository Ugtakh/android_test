package com.example.kotlin_001

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.util.Log
import android.widget.TextView
import java.time.format.TextStyle

class Colortext : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val handler = Handler();
        var timeValue = 0;

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colortext)

        val tv = findViewById<TextView>(R.id.tv)
        val mText = "This is a spannanle colored String."

        val mSpannable = SpannableString(mText)

        val mRed = ForegroundColorSpan(Color.MAGENTA);
//        val mRedStyle =
        val mBlue = ForegroundColorSpan(Color.BLUE)
        val mGreen = ForegroundColorSpan(Color.GREEN)

        mSpannable.setSpan(mRed, 0, 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        tv.text = mSpannable

        val runnable = object : Runnable{
            override fun run() {
                timeValue++
                Log.d("Text", timeValue.toString())
                mSpannable.setSpan(mRed, 0, timeValue, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
                mSpannable.setSpan(StyleSpan(Typeface.BOLD), 0, timeValue, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

                tv.text = mSpannable
                if(timeValue >= mText.length){
                    timeValue = 0
                }
                handler.postDelayed(this,300.toLong())
            }
        }

        handler.post(runnable)
    }
}

