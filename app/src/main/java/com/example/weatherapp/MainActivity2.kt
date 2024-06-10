package com.example.weatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        class YourActivity : AppCompatActivity() {

            // Parallel arrays for weather data
            private val days =
                arrayOf(
                    "Monday",
                    "Tuesday",
                    "Wednesday",
                    "Thursday",
                    "Friday",
                    "Saturday",
                    "Sunday"
                )
            private val minTemps = arrayOf(14, 13, 11, 12, 10, 10, 9)
            private val maxTemps = arrayOf(25, 22, 18, 11, 15, 16, 13)

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main2)

                // Find views
                val dailyButton: Button = findViewById(R.id.dailyButton)
                
                val averageTemp: TextView = findViewById(R.id.averageTemp)

                // Calculate and display average temperature
                val avgTemp = calculateAverageTemperature()
                averageTemp.text = "Average Temp: $avgTemp°C"

                // Set button click listener
                dailyButton.setOnClickListener {
                    val intent = Intent(this, MainActivity3::class.java)
                    startActivity(intent)
                }
            }

            // Function to calculate average temperature
            private fun calculateAverageTemperature(): Double {
                var totalTemp = 0
                for (i in minTemps.indices) {
                    totalTemp += (minTemps[i] + maxTemps[i]) / 2
                }
                return totalTemp.toDouble() / days.size
            }
        }
    }
}



