package com.example.tips_calculator

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.tips_calculator.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.rbOption1.setOnCheckedChangeListener { _, isChecked ->
            println("perna option 1: $isChecked")
        }

        binding.rbOption2.setOnCheckedChangeListener { _, isChecked ->
            println("perna option 2: $isChecked")
        }

        binding.rbOption3.setOnCheckedChangeListener { _, isChecked ->
            println("perna option 3:$isChecked")
        }

        binding.btnCalcular.setOnClickListener {

            val valorTotal : Float = binding.editTotalConta.text.toString().toFloat()
            val numeroPessoas : Float = binding.editNumeroPessoas.text.toString().toFloat()

            val calculo = valorTotal / numeroPessoas

            println(calculo)

        }

        binding.btbClean.setOnClickListener {

            println("tô aqui tb!")
        }

    }
}