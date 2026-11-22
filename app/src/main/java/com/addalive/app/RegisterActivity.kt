package com.addalive.app

import android.app.Activity
import android.os.Bundle
import android.widget.*
import android.view.Gravity
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : Activity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        auth = FirebaseAuth.getInstance()

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(30, 30, 30, 30)

        val name = EditText(this)
        name.hint = "Your Name"

        val email = EditText(this)
        email.hint = "Email Address"

        val password = EditText(this)
        password.hint = "Password"
        password.inputType = 129

        val register = Button(this)
        register.text = "Create Account"

        layout.addView(name)
        layout.addView(email)
        layout.addView(password)
        layout.addView(register)

        setContentView(layout)

        register.setOnClickListener {
            val userEmail = email.text.toString().trim()
            val userPassword = password.text.toString()

            if (userEmail.isEmpty() || userPassword.length < 6) {
                Toast.makeText(
                    this,
                    "Enter valid email and password (minimum 6 characters)",
                    Toast.LENGTH_LONG
                ).show()
                return@setOnClickListener
            }

            auth.createUserWithEmailAndPassword(
                userEmail,
                userPassword
            ).addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Toast.makeText(
                        this,
                        "Account created successfully!",
                        Toast.LENGTH_LONG
                    ).show()
                } else {
                    Toast.makeText(
                        this,
                        task.exception?.message ?: "Registration failed",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
        }
    }
}
