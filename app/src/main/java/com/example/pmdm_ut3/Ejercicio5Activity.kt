package com.example.pmdm_ut3

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Ejercicio5Activity : AppCompatActivity() {

    private lateinit var tvResultado: TextView
    private var num1 = 0.0
    private var operacion = ""
    private var limpiar = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio5)

        tvResultado = findViewById(R.id.tvResultado)

        findViewById<Button>(R.id.b0).setOnClickListener { escribirNumero("0") }
        findViewById<Button>(R.id.b1).setOnClickListener { escribirNumero("1") }
        findViewById<Button>(R.id.b2).setOnClickListener { escribirNumero("2") }
        findViewById<Button>(R.id.b3).setOnClickListener { escribirNumero("3") }
        findViewById<Button>(R.id.b4).setOnClickListener { escribirNumero("4") }
        findViewById<Button>(R.id.b5).setOnClickListener { escribirNumero("5") }
        findViewById<Button>(R.id.b6).setOnClickListener { escribirNumero("6") }
        findViewById<Button>(R.id.b7).setOnClickListener { escribirNumero("7") }
        findViewById<Button>(R.id.b8).setOnClickListener { escribirNumero("8") }
        findViewById<Button>(R.id.b9).setOnClickListener { escribirNumero("9") }

        findViewById<Button>(R.id.bPunto).setOnClickListener {
            if (!tvResultado.text.contains(".")) {
                tvResultado.text = tvResultado.text.toString() + "."
            }
        }

        findViewById<Button>(R.id.bSum).setOnClickListener { elegirOperacion("+") }
        findViewById<Button>(R.id.bRes).setOnClickListener { elegirOperacion("-") }
        findViewById<Button>(R.id.bMul).setOnClickListener { elegirOperacion("*") }
        findViewById<Button>(R.id.bDiv).setOnClickListener { elegirOperacion("/") }

        findViewById<Button>(R.id.bC).setOnClickListener {
            tvResultado.text = "0"
            num1 = 0.0
            operacion = ""
        }

        findViewById<Button>(R.id.bIgual).setOnClickListener {
            val num2 = tvResultado.text.toString().toDouble()
            var total = 0.0

            if (operacion == "+") total = num1 + num2
            if (operacion == "-") total = num1 - num2
            if (operacion == "*") total = num1 * num2
            if (operacion == "/") total = num1 / num2

            tvResultado.text = total.toString()
            limpiar = true
        }
    }

    private fun escribirNumero(numero: String) {
        if (tvResultado.text.toString() == "0" || limpiar) {
            tvResultado.text = numero
            limpiar = false
        } else {
            tvResultado.text = tvResultado.text.toString() + numero
        }
    }

    private fun elegirOperacion(op: String) {
        num1 = tvResultado.text.toString().toDouble()
        operacion = op
        limpiar = true
    }
}