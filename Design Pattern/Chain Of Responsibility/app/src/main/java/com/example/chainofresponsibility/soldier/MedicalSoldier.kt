package com.example.chainofresponsibility.soldier

class MedicalSoldier(var next: Soldier?= null): Soldier {

    override fun onCall(program: String) {
        if(program == "medical")
        {
            println("All Soldier practice about Medical skill")
        }
        else{
            next?.onCall(program)?: println("I'm tired, I need to sleep!!!!!")
        }

    }

}