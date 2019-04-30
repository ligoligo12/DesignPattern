package com.example.facade.subsystem

class Memory {
    fun load(position: Long, data: ByteArray) = println("Loading from memory position: $position")

}