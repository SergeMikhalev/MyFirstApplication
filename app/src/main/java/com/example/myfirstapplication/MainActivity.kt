package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val helloTextView: TextView =findViewById(R.id.hello_txt_view)
        helloTextView.text = getString(R.string.hello_text)

        val randomizeButton: Button = findViewById(R.id.randomize_button)

        randomizeButton.setOnClickListener {
            randomize()
        }
        }
    fun randomize(){
        val randomValue = Random.nextInt(100)
        val helloTextView: TextView=findViewById(R.id.hello_txt_view)
        helloTextView.text = randomValue.toString()
    }
    }