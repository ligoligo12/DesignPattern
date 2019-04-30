package com.example.chainofresponsibility.soldier

class ArrowSoldier(var next: Soldier?=null): Soldier {

    override fun onCall(program: String) {
        if(program == "arrow"){
            println("All Soldier practice about Arrow skill")



        }else{
            next?.onCall(program)?: println("I'm tired, I need to sleep!!!!!")
        }
    }


}