package com.example.helloworld

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find greeting TextView and set learner name dynamic greeting
        val tvGreeting = findViewById<TextView>(R.id.tv_greeting)
        
        // TIP: Change "John Doe" to your actual name
        val learnerName = "Bhavarth "
        tvGreeting.text = "Hello $learnerName!"
    }
}
