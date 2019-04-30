package com.example.mediator

class ATCMediatorDo : ATCMediator{
    private var flight: Flight? = null
    private var runway: Runway? = null
    override var isLandingOk: Boolean = false

    override fun registerRunway(runway: Runway) {
        this.runway = runway
    }

    override fun registerFlight(flight: Flight) {
        this.flight = flight
    }

    override fun setLandingStatus(status: Boolean) {
        isLandingOk = status

    }
}