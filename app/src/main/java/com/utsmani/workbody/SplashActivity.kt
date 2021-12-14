package com.utsmani.workbody

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

@SuppressLint("CustomSplashScreen")
class SplashActivity: AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val timer: Thread = object : Thread() {
            override fun run() {
                try {
                    sleep(3000)
                } catch (e: InterruptedException) {
                    // TODO: handle exception
                    e.printStackTrace()
                } finally {
                    //Goes to Activity  StartingPoint.java(STARTINGPOINT)
                    val openstartingpoint = Intent(this@SplashActivity, MainActivity::class.java)
                    startActivity(openstartingpoint)
                    finish()
                }
            }
        }
        timer.start()
    }
}