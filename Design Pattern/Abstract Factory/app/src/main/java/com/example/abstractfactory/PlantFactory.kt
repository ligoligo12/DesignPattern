package com.example.abstractfactory

import com.example.abstractfactory.product.Plant

abstract class PlantFactory {
        abstract fun makePlant(): Plant
        companion object {
            inline fun <reified T : Plant> createFactory(): PlantFactory = when (T::class) {
                Plant.OrangePlant::class -> OrangeFactory()
                Plant.ApplePlant::class  -> AppleFactory()
                else -> throw IllegalArgumentException()
            }
        }
}
class AppleFactory : PlantFactory() {
    override fun makePlant(): Plant = Plant.ApplePlant()
}

class OrangeFactory : PlantFactory() {
    override fun makePlant(): Plant = Plant.OrangePlant()
}