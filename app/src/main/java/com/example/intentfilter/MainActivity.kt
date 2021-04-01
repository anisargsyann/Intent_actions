package com.example.intentfilter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signIn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("name" , name.text.toString())
            intent.putExtra("surname", surname.text.toString())
            intent.putExtra("number", phoneNumber.text.toString())
            intent.putExtra("email", email.text.toString())
            startActivity(intent)
        }
    }
}