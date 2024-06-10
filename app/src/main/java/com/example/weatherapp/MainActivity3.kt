package com.example.weatherapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        class MainActivity3 : AppCompatActivity() {

            // Parallel arrays for detailed weather data
            private val days = arrayOf(
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            )
            private val minTemps = arrayOf(14, 13, 11, 12, 10, 10, 9)
            private val maxTemps = arrayOf(25, 22, 18, 11, 15, 16, 13)
            private val conditions = arrayOf(
                "sunny", "sunny", "Light rain", "cloudy", "Light rain", "raining", "cold"
            )

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main3)

                // Find view
                val dailyWeatherDetails: TextView = findViewById(R.id.dailyWeatherDetails)

                // Display detailed weather information
                dailyWeatherDetails.text = getDetailedWeatherInfo()
            }

            // Function to get detailed weather information
            private fun getDetailedWeatherInfo(): String {
                val builder = StringBuilder()
                for (i in days.indices) {
                    builder.append("${days[i]}: min ${minTemps[i]}°C, max ${maxTemps[i]}°C, ${conditions[i]}\n")
                }
                return builder.toString()
            }
        }
    }
}
