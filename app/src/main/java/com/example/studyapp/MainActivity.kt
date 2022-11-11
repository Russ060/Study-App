package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    // Defining Variables (Buttons)
    private lateinit var ktButton : Button
    private lateinit var adButton : Button

    // create the layout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button to take us to the Kotlin activity
        ktButton = findViewById(R.id.kotlinButton)
        ktButton.setOnClickListener {
            val intent = Intent(this, KotlinActivity::class.java)
            startActivity(intent)
        }

        // Button to take us to the Android activity
        adButton = findViewById(R.id.androidButton)
        adButton.setOnClickListener {
            val intent = Intent(this, AndroidActivity::class.java)
            startActivity(intent)
        }
    }
}