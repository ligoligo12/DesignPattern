package com.example.command

class EditUser() : Command {

    override fun Execute(user: User) {
        user.name = "Java"
        println("Edit name from 'Kotlin' to '${user.name}'")

    }



}