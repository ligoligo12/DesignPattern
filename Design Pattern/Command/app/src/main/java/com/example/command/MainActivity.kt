package com.example.command

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var user = User("Kotlin")
        var add = AddUser()
        add.Execute(user)
        var edit = EditUser();
        edit.Execute(user)
        var delete = DeleteUser()
        delete.Execute(user)


    }
}
