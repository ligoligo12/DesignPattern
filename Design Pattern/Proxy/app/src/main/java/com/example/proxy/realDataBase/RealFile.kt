package com.example.proxy.realDataBase

class RealFile : File {
    override fun read(name: String) {
        println("Reading file: $name")
    }
}