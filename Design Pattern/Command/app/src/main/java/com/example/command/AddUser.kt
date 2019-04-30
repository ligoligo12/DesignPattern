package com.example.command

class AddUser : Command {

    override fun Execute(user: User) {
        println("Adding a new user with name: "+ user.name)

    }


}