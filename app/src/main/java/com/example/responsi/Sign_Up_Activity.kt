package com.example.responsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.ImageView

class Sign_Up_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val backBtn = findViewById<ImageView>(R.id.imageView2)

        backBtn.setOnClickListener {
            val intentBtnV2 = Intent(this, MainActivity::class.java)
            startActivity(intentBtnV2)
        }
    }
}