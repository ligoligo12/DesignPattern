package com.example.bridge

class RemoteControl(override var appliance: Appliance) : Switch {
    override fun turnOn() {
        appliance.run()
    }
    override fun changeChannal() {
        appliance.change()
    }
    override fun turnOff() {
        appliance.stop()
    }
}