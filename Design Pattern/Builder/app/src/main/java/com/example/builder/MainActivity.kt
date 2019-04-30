package com.example.builder

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dialog: Dialog = dialog {
            title {
                text = "Hello word"
            }
            message {
                text = "Hi My name is Thanat"
                color = "#333333"
            }

        }

        dialog.show()
    }
    fun dialog(init: DialogBuilder.() -> Unit): Dialog {
        return DialogBuilder(init).build()
    }
}
