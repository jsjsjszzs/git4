package com.example.git4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("1")


        println("2 change ")
        println("2 anderer change")

        println(" 1 in branch1")

        println("alles ist gemerged, andere arbeitenn an projekt wieder weiter")

        println("work")

        println("andere haben etwas an main gemacht")
    }
}