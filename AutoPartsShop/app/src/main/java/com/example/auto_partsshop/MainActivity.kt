package com.example.auto_partsshop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var logemail = findViewById(R.id.logemail) as EditText
        var log_password = findViewById(R.id.log_password) as EditText
        var signinbtn = findViewById(R.id.signinbtn) as Button
        var registrationbtn = findViewById(R.id.registrationbtn) as Button

        // Signin button
        signinbtn.setOnClickListener {
            val logemail = logemail.text;
            val log_password = log_password.text;
            Toast.makeText(this@MainActivity, log_password, Toast.LENGTH_LONG).show()


        }
        //Goto Registration Page
        registrationbtn.setOnClickListener{
            val intent = Intent(this,RegistrationActivity :: class.java)
            startActivity(intent)
        }

    }
}