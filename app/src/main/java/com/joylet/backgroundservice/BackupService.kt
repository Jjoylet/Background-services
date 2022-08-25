package com.joylet.backgroundservice

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast

class BackupService : Service() {
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        onTaskRemoved(intent)
        Toast.makeText(applicationContext,"Uploading",Toast.LENGTH_SHORT).show()
        return START_STICKY
    }
    override fun onBind(intent: Intent): IBinder? {
       return null;
    }

    override fun onTaskRemoved(rootIntent: Intent?) {
        val intentRestart = Intent(applicationContext,this.javaClass)
        intentRestart.setPackage("com.joylet.backgroundservice")
        startService(intentRestart)
        super.onTaskRemoved(rootIntent)
    }
}