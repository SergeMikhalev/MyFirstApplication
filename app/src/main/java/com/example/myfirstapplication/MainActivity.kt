package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.tabs.TabLayout
import kotlin.random.Random


private const val TAG = "MainActivity"
private const val MY_OWN_LOG_TAG = "MyOwnLog"
private const val VALUE = "Value"

class MainActivity : AppCompatActivity() {

    private lateinit var helloTextView: TextView
    private lateinit var randomizeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        helloTextView = findViewById(R.id.hello_txt_view)
        randomizeButton = findViewById(R.id.randomize_button)


    if  (savedInstanceState != null)
        helloTextView.text = savedInstanceState.getString(VALUE)
        else
            randomize()

        randomizeButton.setOnClickListener{randomize()}

        Log.d(MY_OWN_LOG_TAG, "onCreate()")

    }

    override fun onStart() {
        super.onStart()
        Log.d(MY_OWN_LOG_TAG,"onStart()")

    }

    override fun onResume() {
        super.onResume()
        Log.d(MY_OWN_LOG_TAG, "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(MY_OWN_LOG_TAG, "onPause()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(MY_OWN_LOG_TAG, "onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MY_OWN_LOG_TAG, "onDestroy()")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putString(VALUE, helloTextView.text.toString())
    }

    fun randomize(){
        val randomValue = Random.nextInt(1000)
        val helloTextView: TextView = findViewById(R.id.hello_txt_view)
        helloTextView.text = randomValue.toString()
    }

}

