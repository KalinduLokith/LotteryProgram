package com.example.lotteryprog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {

    private lateinit var result1TextView: TextView
    private lateinit var result2TextView: TextView
    private lateinit var result3TextView: TextView
    private lateinit var generateButton1: Button
    private lateinit var generateButton2: Button
    private lateinit var generateButton3: Button
    private lateinit var generateButtonAll: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        result1TextView = findViewById(R.id.result1)
        result2TextView = findViewById(R.id.result2)
        result3TextView = findViewById(R.id.result3)
        generateButton1 = findViewById(R.id.generateButton1)
        generateButton2 = findViewById(R.id.generateButton2)
        generateButton3 = findViewById(R.id.generateButton3)
        generateButtonAll = findViewById(R.id.generateButtonAll)

        generateButton1.setOnClickListener {
            // generate one random number
            val num1 = (0..99).random()

            // display the number in the first text view
            result1TextView.text = num1.toString()
        }

        generateButton2.setOnClickListener {
            // generate one random number
            val num2 = (0..99).random()

            // display the number in the second text view
            result2TextView.text = num2.toString()
        }

        generateButton3.setOnClickListener {
            // generate one random number
            val num3 = (0..99).random()

            // display the number in the third text view
            result3TextView.text = num3.toString()
        }

        generateButtonAll.setOnClickListener {
            // generate three random numbers
            val num1 = (0..99).random()
            val num2 = (0..99).random()
            val num3 = (0..99).random()

            // display the numbers in the text views
            result1TextView.text = num1.toString()
            result2TextView.text = num2.toString()
            result3TextView.text = num3.toString()
        }
    }
}
