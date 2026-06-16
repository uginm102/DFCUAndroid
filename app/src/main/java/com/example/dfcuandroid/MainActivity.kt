package com.example.dfcuandroid

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvKnowledgeHub = findViewById<TextView>(R.id.tvKnowledgeHub)

        // Listen for user clicking the "Knowledge Hub" text link
        tvKnowledgeHub.setOnClickListener {
            // Create an Intent to open the WebHubActivity
            val intent = Intent(this, WebHubActivity::class.java)
            startActivity(intent)
        }
    }
}
