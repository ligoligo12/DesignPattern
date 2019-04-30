package com.example.bridge

class TV : Appliance {
    override fun run() {
        println("Turn On TV")
    }
    override fun change() {
        println("Change from Ch3 to Ch23")
    }
    override fun stop() {
        println("Turn Off TV")
    }
}