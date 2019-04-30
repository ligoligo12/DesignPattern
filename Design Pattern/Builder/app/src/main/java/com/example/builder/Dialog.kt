package com.example.builder

class Dialog {
    fun showTitle() = println("showing title")
    fun setTitle(text: String) = println("setting title text $text")
    fun setTitleColor(color: String) = println("setting title color $color")
    fun showMessage() = println("showing message")
    fun setMessage(text: String) = println("setting message $text")
    fun setMessageColor(color: String) = println("setting message color $color")
    fun show() = println("showing dialog $this")

}