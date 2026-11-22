package com.addalive.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class RegisterActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(30, 30, 30, 30)
        layout.setBackgroundColor(Color.rgb(20, 20, 35))

        val title = TextView(this)
        title.text = "Create Addalive Account"
        title.textSize = 25f
        title.setTextColor(Color.WHITE)
        title.gravity = Gravity.CENTER

        val name = EditText(this)
        name.hint = "Your Name"

        val email = EditText(this)
        email.hint = "Email Address"

        val password = EditText(this)
        password.hint = "Create Password"
        password.inputType = 129

        val register = Button(this)
        register.text = "Create Account"

        layout.addView(title)
        layout.addView(name)
        layout.addView(email)
        layout.addView(password)
        layout.addView(register)

        setContentView(layout)
    }
}
