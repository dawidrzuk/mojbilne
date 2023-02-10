package com.example.dwdwdwdw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val obraz1 = findViewById<ImageView>(R.id.imageView)
        val obraz2 = findViewById<ImageView>(R.id.imageView2)
        val obraz3 = findViewById<ImageView>(R.id.imageView3)
    }
}