package com.example.facade

import com.example.facade.subsystem.CPU
import com.example.facade.subsystem.HardDrive
import com.example.facade.subsystem.Memory

class Computer(val processor: CPU = CPU(), val ram: Memory = Memory(), val hd: HardDrive = HardDrive()) {
    companion object {
        val BOOT_ADDRESS = 0L
        val BOOT_SECTOR = 34L
        val SECTOR_SIZE = 0
    }

    fun start() {
        processor.freeze()
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE))
        processor.jump(BOOT_ADDRESS)
        processor.execute()
        println(ram)
    }
}