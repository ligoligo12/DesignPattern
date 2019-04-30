package com.example.abstractfactory

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.abstractfactory.product.Plant

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val plantFactory = PlantFactory.createFactory<Plant.OrangePlant>()
        val plant = plantFactory.makePlant()
        Log.i("sssssss", plant.toString())
    }
}
