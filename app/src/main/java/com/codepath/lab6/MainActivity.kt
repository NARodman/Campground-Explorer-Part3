package com.codepath.lab6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codepath.lab6.databinding.ActivityMainBinding
import kotlinx.serialization.json.Json

// Helper function for JSON parsing
fun createJson() = Json {
    isLenient = true
    ignoreUnknownKeys = true
    useAlternativeNames = false
}

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set up ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}