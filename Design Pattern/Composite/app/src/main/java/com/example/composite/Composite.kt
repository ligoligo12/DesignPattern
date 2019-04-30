package com.example.composite

open class Composite(name: String) : Equipment(0, name)  {
    val equipments = ArrayList<Equipment>()

    fun add(equipment: Equipment) {
        this.equipments.add(equipment)
    }
    override fun getPrice(): Int {
        return equipments.map { it -> it.getPrice() }.sum()
    }
}
class Mybag : Composite("My Bag")
class Pen : Equipment(150, "Premium Pen")
class Macbook : Equipment(75000, "Macbook")
class CameraX: Equipment(28000, "Camera")