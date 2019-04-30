package com.example.chainofresponsibility.soldier

class SwordSoldier(var next: Soldier?=null):Soldier {

    override fun onCall(program: String) {
        if (program == "sword"){
            println("All Soldier practice about Sword skill")
        }else{
            next?.onCall(program)?: println("Good job, See you tomorrow!")
        }
    }
}