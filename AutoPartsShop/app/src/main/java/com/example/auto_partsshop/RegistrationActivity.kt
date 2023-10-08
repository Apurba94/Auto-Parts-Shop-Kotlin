package com.example.auto_partsshop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        //Back Button
        val actionBar = supportActionBar
        actionBar !!.title = "RegistrationActivity"
        actionBar.setDisplayHomeAsUpEnabled(true)

        //variables
        var reg_email = findViewById(R.id.reg_email) as EditText
        var reg_password = findViewById(R.id.reg_password) as EditText
        var reg_con_password = findViewById(R.id.reg_con_password) as EditText
        var reg_mobile_no = findViewById(R.id.reg_mobile_no) as EditText
        var signupbtn = findViewById(R.id.signupbtn) as Button

        //Going back to Login Page
        signupbtn.setOnClickListener{
            val intent = Intent(this,MainActivity :: class.java)
            startActivity(intent)
        }


    }
}