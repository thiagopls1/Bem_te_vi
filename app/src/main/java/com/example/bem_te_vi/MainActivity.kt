package com.example.bem_te_vi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.media.MediaPlayer


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()

        val btnBtv = findViewById<ImageButton>(R.id.btnBemTeVi)
        val playBemTeVi = MediaPlayer.create(this, R.raw.bem_te_vi)

        btnBtv.setOnClickListener {
            playBemTeVi.start()
        }
    }
}

