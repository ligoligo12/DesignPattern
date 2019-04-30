 package com.example.composite

import android.graphics.Camera
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var myBag = Mybag()
        myBag.add(Pen())
        myBag.add(Macbook())
        myBag.add(CameraX())
        println("Total price in Bag = "+ myBag.getPrice())
    }
}
