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
            arrayListOf("Topic1","Description1","Detailed notes 1"),
            arrayListOf("Topic2","Description2","Detailed notes 2"),
            arrayListOf("Topic3","Description3","Detailed notes 3"),
            arrayListOf("Topic4","Description4","Detailed notes 4"),
            arrayListOf("Topic5","Description5","Detailed notes 5"),
            arrayListOf("Topic6","Description6","Detailed notes 6"),
            arrayListOf("Topic7","Description7","Detailed notes 7"),
            arrayListOf("Topic8","Description8","Detailed notes 8"),
            arrayListOf("Topic9","Description9","Detailed notes 9"),
            arrayListOf("Topic10","Description10","Detailed notes 10")
            )


        val myRV = findViewById<RecyclerView>(R.id.rvAndroid)
        myRV.adapter = RecyclerAdapter(this,lessons, image)
        myRV.layoutManager = LinearLayoutManager(this)

    }
}