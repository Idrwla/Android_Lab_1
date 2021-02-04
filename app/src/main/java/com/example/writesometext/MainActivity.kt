package com.example.writesometext

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    var userText: String = "This is a default text"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submitText(view: View){
        val inputLabel = findViewById<TextInputEditText>(R.id.inputText)
        this.userText = inputLabel.text.toString()
        setText(view)
    }

    private fun setText(view: View){
        val mainTextView = findViewById<TextView>(R.id.textView)
        mainTextView.setText(this.userText)
    }

    fun makeToast(view: View){
        val toast = Toast.makeText(this, this.userText, Toast.LENGTH_SHORT)
        toast.show()
    }
}