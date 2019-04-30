package com.example.adapter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val thaicurrency = Thaicurrency(0.0)
        val uscurrency = Uscurrency(thaicurrency)

        thaicurrency.convertcurrency = 15000.0
        println("${thaicurrency.convertcurrency} Bath -> ${uscurrency.convertcurrency} USD")
        uscurrency.convertcurrency = 15000.0
        println("${uscurrency.convertcurrency} USD -> ${thaicurrency.convertcurrency} Bath")


    }
}
