package com.lauwba.xmlkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.schedule

class SplashCircle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_circle)

        Timer("splahDisappear", true).schedule(3000){
            startActivity(Intent(this@SplashCircle, Video::class.java))
            finish()
        }

    }
}