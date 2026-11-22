package com.addalive.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Button
import android.view.Gravity

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setBackgroundColor(Color.rgb(20, 20, 35))
        layout.setPadding(30, 30, 30, 30)

        val title = TextView(this)
        title.text = "ADDALIVE"
        title.textSize = 32f
        title.setTextColor(Color.WHITE)
        title.gravity = Gravity.CENTER

        val subtitle = TextView(this)
        subtitle.text = "Connect • Chat • Enjoy"
        subtitle.textSize = 16f
        subtitle.setTextColor(Color.LTGRAY)
        subtitle.gravity = Gravity.CENTER

        val login = Button(this)
        login.text = "Login"

        val register = Button(this)
        register.text = "Create Account"

        layout.addView(title)
        layout.addView(subtitle)
        layout.addView(login)
        layout.addView(register)

        setContentView(layout)
    }
}
