package com.example.intentfilter

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.second_activity.*

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        val number = intent.getStringExtra("number")
        val email = intent.getStringExtra("email")
        call.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_DIAL
            intent.data = Uri.parse("tel:$number")
            startActivity(intent)
        }
        emailVarification.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_SENDTO
            intent.data = Uri.parse("mailto:$email")
           // intent.putExtra(Intent.EXTRA_EMAIL, "$email")
            intent.putExtra(Intent.EXTRA_TEXT, "This is a verification message")
            startActivity(Intent.createChooser(intent, "Choose the option"))
        }
        camera.setOnClickListener {
            val intent = Intent()
            intent.action = MediaStore.ACTION_IMAGE_CAPTURE
            startActivity(intent)
        }
    }
}