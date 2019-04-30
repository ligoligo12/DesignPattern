package com.example.bridge

class VacumCleaner : Appliance {
    override fun run() {
        println("Turn On VacumCleaner")
    }

    override fun change() {
        println("power up ")
    }

    override fun stop() {
        println("Turn Off VacumCleaner")
    }
}