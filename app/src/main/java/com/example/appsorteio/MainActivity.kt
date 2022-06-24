package com.example.appsorteio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortearNumero(view: View) {
        val texto = findViewById<TextView>(R.id.textView)
        var numeroSorteado = Random.nextInt(11)
        texto.text = "O número sorteado é: " + numeroSorteado
    }
}