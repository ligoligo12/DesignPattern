package com.example.proxy.proxy

import com.example.proxy.realDataBase.File
import com.example.proxy.realDataBase.RealFile

class ProxyFile : File {
    val realFile = RealFile()
    var password = ""
    override fun read(name: String) {
        if(password == "qwert")
        {
            realFile.read(name)
        }else{
            println("Incorrect password")
        }

    }
}