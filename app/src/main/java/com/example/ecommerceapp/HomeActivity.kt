package com.example.ecommerceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btn =  findViewById<Button>(R.id.splash_button)
        btn.setOnClickListener {
            val splash = Intent(this, SplashActivity::class.java)
            startActivity(splash)
        }
    }
}