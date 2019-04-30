package com.example.factorypattern

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.factorypattern.Product.TypeSuperCar
import java.lang.IllegalArgumentException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //print("Choose type Supercar(LAMBORQHINI,FERRARI,POCHER) : ")
        var typeSupercar = "LAMBORQHINI"
        var supercar = SupercarFactory.createSupercar(when (typeSupercar){
           "LAMBORQHINI" -> TypeSuperCar.LAMBORQHINI
           "FERRARI" -> TypeSuperCar.FERRARI
            "POCHER" -> TypeSuperCar.POCHER
            else -> throw IllegalArgumentException("There is no This type")
        })
        Log.i("Output " ,"Name : ${supercar.nameSuperCar()}")
        Log.i("Output " ,"Price : ${supercar.price()}")


    }
}
