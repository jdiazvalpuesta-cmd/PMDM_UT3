package com.example.pmdm_ut3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)

        btn1.setOnClickListener { startActivity(Intent(this, Ejercicio1Activity::class.java)) }
        btn2.setOnClickListener { startActivity(Intent(this, Ejercicio2Activity::class.java)) }
        btn3.setOnClickListener { startActivity(Intent(this, Ejercicio3Activity::class.java)) }
        btn4.setOnClickListener { startActivity(Intent(this, Ejercicio4Activity::class.java)) }
        btn5.setOnClickListener { startActivity(Intent(this, Ejercicio5Activity::class.java)) }
        btn6.setOnClickListener { startActivity(Intent(this, Ejercicio6Activity::class.java)) }
    }
}