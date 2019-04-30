package com.example.mediator

class Flight(private var atcMediator: ATCMediator): Command {
    override fun land() {
        if(atcMediator.isLandingOk){
            println("Landing done....")
            atcMediator.setLandingStatus(true)
        }else
            println("Will wait to land....")
    }
    fun getReady() {
        println("Getting ready...")
    }
}