package com.example.bridge

interface Switch {
    var appliance: Appliance
    fun turnOn()
    fun changeChannal()
    fun turnOff()
}