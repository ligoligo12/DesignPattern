package com.example.composite

open class Equipment(private var price: Int, private var name: String) {
    open fun getPrice(): Int = price
}