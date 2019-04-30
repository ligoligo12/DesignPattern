package com.example.builder

class DialogBuilder {

    constructor(init: DialogBuilder.() -> Unit) : this() {
        init()
    }

    constructor()


    private var titleHolder: TextView? = null
    private var messageHolder: TextView? = null

    fun title(init: TextView.() -> Unit) {
        titleHolder = TextView().apply { init() }
    }

    fun message(init: TextView.() -> Unit) {
        messageHolder = TextView().apply { init() }
    }



    fun build(): Dialog {
        val dialog = Dialog()

        titleHolder?.apply {
            dialog.setTitle(text)
            dialog.setTitleColor(color)
            dialog.showTitle()
        }

        messageHolder?.apply {
            dialog.setMessage(text)
            dialog.setMessageColor(color)
            dialog.showMessage()
        }



        return dialog
    }

    class TextView {
        var text: String = ""
        var color: String = "#012323"
    }
}