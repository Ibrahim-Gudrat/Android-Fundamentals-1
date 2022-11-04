package com.abrahamgudratli.reviewfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var editTextNumber: EditText
    private lateinit var editTextNumber2: EditText
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViews()
        button.setOnClickListener { calculate() }

    }

    private fun findViews() {
        button = findViewById(R.id.button)
        editTextNumber = findViewById(R.id.editTextNumber)
        editTextNumber2 = findViewById(R.id.editTextNumber2)
        textView = findViewById(R.id.textView)
    }

    private fun calculate() {
        var a: Int = Integer.parseInt(editTextNumber.text.toString())
        var b: Int = Integer.parseInt(editTextNumber2.text.toString())
        var result = a + b
        textView.text = result.toString()

    }

}