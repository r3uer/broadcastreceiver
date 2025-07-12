package com.example.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class broadcastreceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if(intent?.action ==Intent.ACTION_BOOT_COMPLETED){
            val serviceintent = Intent(context,MyService::class.java)
            context?.startService(serviceintent)
        }
    }

}