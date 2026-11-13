package com.example.pmdm_ut3

import android.app.PendingIntent
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Ejercicio2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2)

        val btnIr = findViewById<Button>(R.id.btnIr)

        btnIr.setOnClickListener {
            Toast.makeText(this, "Esperando 10 segundos...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Ejercicio2DestinoActivity::class.java)
            val pendingIntent = PendingIntent.getActivity(
                this, 0, intent, PendingIntent.FLAG_IMMUTABLE
            )

            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({
                pendingIntent.send()
            }, 10000)
        }
    }
}