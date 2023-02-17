package com.example.dwdwdwdw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
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
        val pb2 = findViewById<ProgressBar>(R.id.progressBar)
        val pb1 = findViewById<ProgressBar>(R.id.progressBar2)

        val but = findViewById<Button>(R.id.button)

        but.setOnClickListener {
            sb1dlug.progress = 100
            sb2dlug.progress = 100
            sb3dlug.progress = 100

            sb1szer.progress = 100
            sb2szer.progress = 100
            sb3szer.progress = 100
        }

            fun ChangeProgressBarValueVertical(seekbar1: SeekBar, progressBar: ProgressBar){
                progressBar.progress = (seekbar1.progress);
            }
            sb1dlug.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                    obraz1.scaleY = progress / 100f

                    ChangeProgressBarValueVertical(sb1dlug, pb1)
                }

                override fun onStartTrackingTouch(p0: SeekBar) {}
                override fun onStopTrackingTouch(p0: SeekBar) {}

            })
        sb2dlug.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                obraz2.scaleY = progress / 100f

                ChangeProgressBarValueVertical(sb2dlug, pb1)
            }

            override fun onStartTrackingTouch(p0: SeekBar) {}
            override fun onStopTrackingTouch(p0: SeekBar) {}

        })
        sb3dlug.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                obraz3.scaleY = progress / 100f

                ChangeProgressBarValueVertical(sb3dlug, pb1)
            }

            override fun onStartTrackingTouch(p0: SeekBar) {}
            override fun onStopTrackingTouch(p0: SeekBar) {}

        })
        }

        }