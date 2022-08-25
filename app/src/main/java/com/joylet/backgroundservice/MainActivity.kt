package com.joylet.backgroundservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart : Button = findViewById(R.id.buttonStart)
        val btnStop : Button = findViewById(R.id.buttonStop)

        btnStart.setOnClickListener{
            val intentStart = Intent(this,BackupService::class.java)
          startService(intentStart)
        }
        btnStop.setOnClickListener{
            val intentStart = Intent(this,BackupService::class.java)
            stopService(intentStart)
        }
    }
}