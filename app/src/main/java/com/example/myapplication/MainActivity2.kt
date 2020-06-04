package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)



        val but = findViewById<Button>(R.id.button);
        but.isEnabled;
        but.setOnClickListener { Toast.makeText(this,"item unlocked", Toast.LENGTH_SHORT).show() }
    }
}