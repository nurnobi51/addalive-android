package com.addalive.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class LoginActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(30, 30, 30, 30)
        layout.setBackgroundColor(Color.rgb(20, 20, 35))

        val title = TextView(this)
        title.text = "Welcome to Addalive"
        title.textSize = 26f
        title.setTextColor(Color.WHITE)
        title.gravity = Gravity.CENTER

        val email = EditText(this)
        email.hint = "Enter Email"

        val password = EditText(this)
        password.hint = "Enter Password"
        password.inputType = 129

        val login = Button(this)
        login.text = "Login"

        layout.addView(title)
        layout.addView(email)
        layout.addView(password)
        layout.addView(login)

        setContentView(layout)
    }
}
