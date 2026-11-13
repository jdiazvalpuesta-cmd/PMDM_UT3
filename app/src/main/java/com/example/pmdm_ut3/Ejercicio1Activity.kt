package com.example.pmdm_ut3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Ejercicio1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio1)

        val etUrl = findViewById<EditText>(R.id.etUrl)
        val btnAbrir = findViewById<Button>(R.id.btnAbrir)

        btnAbrir.setOnClickListener {
            var url = etUrl.text.toString()

            if (url.isEmpty() || !Patterns.WEB_URL.matcher(url).matches()) {
                Toast.makeText(this, "Introduce una URL válida", Toast.LENGTH_SHORT).show()
            } else {
                // Por si escribes "www.google.com" sin https:// delante, para que no pete
                if (!url.startsWith("http://") && !url.startsWith("https://")) {
                    url = "https://$url"
                }
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }
    }
}