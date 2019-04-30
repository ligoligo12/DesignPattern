package com.example.proxy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.proxy.proxy.ProxyFile

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val proxyFile = ProxyFile()
        proxyFile.read("Test Read File")
        proxyFile.password = "qwert"
        proxyFile.read("Test Read File")


    }
}
