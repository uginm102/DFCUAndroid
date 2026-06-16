package com.example.dfcuandroid

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dfcuandroid.ui.theme.DFCUAndroidTheme

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
