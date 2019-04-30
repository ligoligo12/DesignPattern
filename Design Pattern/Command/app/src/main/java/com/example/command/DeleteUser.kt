package com.example.command

class DeleteUser : Command {

    override fun Execute(user: User) {
        println("Delete user with name: "+ user.name)
    }


}