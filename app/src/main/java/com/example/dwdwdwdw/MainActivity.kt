package com.example.dwdwdwdw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val obraz1 = findViewById<ImageView>(R.id.imageView)
        val obraz2 = findViewById<ImageView>(R.id.imageView2)
        val obraz3 = findViewById<ImageView>(R.id.imageView3)
        val sb1szer = findViewById<SeekBar>(R.id.seekBar)
        val sb2szer = findViewById<SeekBar>(R.id.seekBar2)
        val sb3szer = findViewById<SeekBar>(R.id.seekBar3)
        val sb1dlug = findViewById<SeekBar>(R.id.seekBar5)
        val sb2dlug = findViewById<SeekBar>(R.id.seekBar6)
        val sb3dlug = findViewById<SeekBar>(R.id.seekBar7)

        var sb1szerr = sb1szer.progress
    }
}