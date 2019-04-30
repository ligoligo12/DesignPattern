package com.example.factorypattern

import com.example.factorypattern.Product.SuperCar
import com.example.factorypattern.Product.TypeSuperCar

class SupercarFactory {
    companion object {
        fun createSupercar(typeSuperCar: TypeSuperCar) : SuperCar = when (typeSuperCar){
            TypeSuperCar.FERRARI -> object : SuperCar{
                private val nameProduct = "Ferrari F1"
                private val priceProduct = "1,000,000 $"
                override fun nameSuperCar() = println("$nameProduct")
                override fun price() = println("$priceProduct")
            }
            TypeSuperCar.LAMBORQHINI -> object  : SuperCar{
                private val nameProduct = "Lamborqhini gallardo"
                private val priceProduct = "700,000 $"
                override fun nameSuperCar() = println("$nameProduct")
                override fun price() = println("$priceProduct")
            }
            TypeSuperCar.POCHER -> object  : SuperCar{
                private val nameProduct = "Pocher 911"
                private val priceProduct = "160,000 $"
                override fun nameSuperCar() = println("$nameProduct")
                override fun price() = println("$priceProduct")
            }
        }
    }
}