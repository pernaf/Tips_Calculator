package com.example.tips_calculator

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTotalConta = findViewById<TextInputEditText>(R.id.edit_total_conta)

        val editNumeroPessoas = findViewById<TextInputEditText>(R.id.edit_numero_pessoas)

        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener {

            println("agora ta certo")


        }

    }
}