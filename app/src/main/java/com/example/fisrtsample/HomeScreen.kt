package com.example.fisrtsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class HomeScreen : AppCompatActivity() {
    var msg="Android :"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)
        var userName=intent.getStringExtra("username")
        var greetings:TextView=findViewById(R.id.home_user)
        greetings.text="Welcome "+userName.toString()
        var logoutButton:Button = findViewById(R.id.logout_button)
        logoutButton.setOnClickListener{
            super.finish()
        }
    }
}