package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AndroidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android)

        val image = R.drawable.ic_android_black_24dp
        val lessons = arrayListOf(
            // arrayListOf("Topic","Description","The Lesson")
            arrayListOf("Project setup","Setting up an Android Studio project","Detailed notes here."),
            arrayListOf("Console","Understanding console","Detailed notes here."),
            arrayListOf("Resource files","Understanding Resources","Detailed notes here."),
            arrayListOf("UI Elements","Creating, Modifying,and initializing UI elements","Detailed notes here.")
            )


        val myRV = findViewById<RecyclerView>(R.id.rvAndroid)
        myRV.adapter = RecyclerAdapter(this,lessons, image)
        myRV.layoutManager = LinearLayoutManager(this)

    }
}