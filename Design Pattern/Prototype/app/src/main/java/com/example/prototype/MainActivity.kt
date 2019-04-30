package com.example.prototype

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bike = Bike()
        val basicBike = bike.clone()
        println("Prototype Design Pattern: " + bike.model!!)
        println("Clone Prototype Design Pattern: " + basicBike.model!!)
        val advancedBike = makeJaguar(basicBike)
        println("Reuse Prototype Design Pattern: " + advancedBike.model!!)
    }
    class Bike : Cloneable {
        private var gears: Int = 0
        private var bikeType: String? = null
        var model: String? = null
            private set

        init {
            bikeType = "Standard"
            model = "Leopard"
            gears = 4
        }

        public override fun clone(): Bike {
            return Bike()
        }

        fun makeAdvanced() {
            bikeType = "Advanced"
            model = "Jaguar"
            gears = 6
        }
    }

    fun makeJaguar(advancedBike: Bike): Bike {
        advancedBike.makeAdvanced()
        return advancedBike
    }


}
