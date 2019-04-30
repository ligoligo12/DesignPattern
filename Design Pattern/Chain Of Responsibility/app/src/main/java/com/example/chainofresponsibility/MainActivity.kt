package com.example.chainofresponsibility

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.chainofresponsibility.soldier.ArrowSoldier
import com.example.chainofresponsibility.soldier.MedicalSoldier
import com.example.chainofresponsibility.soldier.Soldier
import com.example.chainofresponsibility.soldier.SwordSoldier

class MainActivity : AppCompatActivity() {

    val arrowSoldiers = ArrowSoldier()
    val swordSoldiers = SwordSoldier()
    val medicalSoldiers = MedicalSoldier()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val soldiers = changeProgram(arrowSoldiers,medicalSoldiers,swordSoldiers)
        soldiers.onCall("arrow")
        soldiers.onCall("medical")
        soldiers.onCall("sword")
        soldiers.onCall("non")

    }
    fun changeProgram(arrowSoldier: ArrowSoldier
                      ,medicalSoldier: MedicalSoldier
                      ,swordSoldier: SwordSoldier):Soldier{
        arrowSoldier.next = medicalSoldier
        medicalSoldier.next = swordSoldier
        return arrowSoldier
    }
}
