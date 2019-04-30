package com.example.mediator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val atcMediator = ATCMediatorDo()
        val boling747 = Flight(atcMediator)
        val boling733 = Flight(atcMediator)
        val mainRunway = Runway(atcMediator)
        atcMediator.registerFlight(boling747)
        atcMediator.registerFlight(boling733)
        atcMediator.registerRunway(mainRunway)
        boling747.getReady()
        mainRunway.land()
        boling747.land()

    }
}
