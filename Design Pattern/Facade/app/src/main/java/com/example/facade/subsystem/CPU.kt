package com.example.facade.subsystem

class CPU {
        fun freeze() = println("Freezing.")

        fun jump(position: Long) = println("Jump to $position.")

        fun execute() = println("Executing.")


}