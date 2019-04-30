package com.example.mediator

class Runway(private var atcMediator: ATCMediator): Command {
    init {
        atcMediator.setLandingStatus(true)
    }
    override fun land() {
        println("Landing permission granted...")
        atcMediator.setLandingStatus(true)
    }
}