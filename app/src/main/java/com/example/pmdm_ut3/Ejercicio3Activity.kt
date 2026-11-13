package com.example.pmdm_ut3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Ejercicio3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio3)

        findViewById<Button>(R.id.btnPant1).setOnClickListener {
            startActivity(Intent(this, Pantalla1Activity::class.java))
        }
        findViewById<Button>(R.id.btnPant2).setOnClickListener {
            startActivity(Intent(this, Pantalla2Activity::class.java))
        }
        findViewById<Button>(R.id.btnPant3).setOnClickListener {
            startActivity(Intent(this, Pantalla3Activity::class.java))
        }
    }
}