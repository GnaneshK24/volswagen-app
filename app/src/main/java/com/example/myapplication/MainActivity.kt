package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var regNum : EditText
    lateinit var passwordinp : EditText
    lateinit var lognbtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        regNum = findViewById(R.id.reg_num)
        passwordinp = findViewById(R.id.passw)
        lognbtn = findViewById(R.id.login_btn)

        lognbtn.setOnClickListener{
            val reg = regNum.text.toString()
            val pass = passwordinp.text.toString()
            Log.i( "Test Credentials","Registration : $reg and Password :$pass")
        }
    }
}