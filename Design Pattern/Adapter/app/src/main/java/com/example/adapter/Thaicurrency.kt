package com.example.adapter

class Thaicurrency(override var convertcurrency: Double) : Convertcurrency
class Uscurrency(var thaicurrentcy: Thaicurrency) : Convertcurrency {

    override var convertcurrency: Double
        get() = convertUsaToThai(thaicurrentcy.convertcurrency)
        set(temperatureInF) {
            thaicurrentcy.convertcurrency = convertThaiToUsa(temperatureInF)
        }

    private fun convertThaiToUsa(thai: Double): Double = thai * 32.5

    private fun convertUsaToThai(usa: Double): Double = usa * 0.03207
}