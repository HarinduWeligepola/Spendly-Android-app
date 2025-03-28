package com.example.spendly


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.spendly.R.id.button5
import com.example.spendly.Register



class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)

        // Handling window insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find the button and set a click listener
        val button5: Button = findViewById(R.id.button5)
        button5.setOnClickListener {
            // Start the Register activity
            val intent = Intent(this, Register::class.java)
            startActivity(intent)

            // Apply fade-in transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        // Find the button and set a click listener
        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            // Start the Register activity
            val intent = Intent(this, Home::class.java)
            startActivity(intent)

            // Apply fade-in transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
    }
}
