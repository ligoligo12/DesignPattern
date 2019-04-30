package com.example.bridge

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tvRemoteControl = RemoteControl(appliance = TV())
        tvRemoteControl.turnOn()
        tvRemoteControl.turnOff()
        var VacumCleanerRemoteControl = RemoteControl(appliance = VacumCleaner())
        VacumCleanerRemoteControl.turnOn()
        VacumCleanerRemoteControl.turnOff()
    }
}
