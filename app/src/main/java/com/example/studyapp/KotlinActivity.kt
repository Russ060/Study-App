package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        val image = R.drawable.ic_baseline_code_24
        val lessons = arrayListOf(
            // arrayListOf("Topic","Description","The Lesson")
            arrayListOf("val and var","Working with Variables.","Detailed notes here."),
            arrayListOf("User Input","Getting user input.","Detailed notes here."),
            arrayListOf("Strings","String Concatenation and Interpolation.","Detailed notes here."),
            arrayListOf("Data Types","Understanding data types.","Detailed notes here."),
            arrayListOf("Basic Operations","Performing math operations in Kotlin.","Detailed notes here."),
            arrayListOf("If Statements","Guiding our program in the right direction.","Detailed notes here."),
            arrayListOf("Try/Catch","Error handling.","Detailed notes here."),
            arrayListOf("For Loops","Understanding for loop.","Detailed notes here."),
            arrayListOf("While Loops","Understanding while loop.","Detailed notes here."),
            arrayListOf("When","When blocks.","Detailed notes here.")
        )


        val myRV = findViewById<RecyclerView>(R.id.rvKotlin)
        myRV.adapter = RecyclerAdapter(this,lessons, image)
        myRV.layoutManager = LinearLayoutManager(this)

    }
}