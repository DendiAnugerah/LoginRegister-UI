package com.example.responsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signUpText = findViewById<TextView>(R.id.textView7)

        signUpText.setOnClickListener{
            val intent = Intent(this, Sign_Up_Activity::class.java)
            startActivity(intent)

            signUpText.movementMethod = LinkMovementMethod.getInstance();
        }
    }
}