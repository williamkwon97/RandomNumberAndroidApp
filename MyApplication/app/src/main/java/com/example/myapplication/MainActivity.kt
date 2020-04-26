package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.*
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButoon = findViewById<Button>(R.id.rollButton)
        val resultTextview = findViewById<TextView>(R.id.resultTextview)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        rollButoon.setOnClickListener {
        val rand = Random().nextInt(seekBar.progress)+1
            resultTextview.text = rand.toString()
        }
    }
}
