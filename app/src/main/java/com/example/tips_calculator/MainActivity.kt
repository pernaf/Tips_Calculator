package com.example.tips_calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tips_calculator.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var percentage: Int = 0
        binding.rbOption1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                percentage = 10
            }

        }

        binding.rbOption2.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                percentage = 15
            }
        }

        binding.rbOption3.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                percentage = 20
            }
        }

        binding.btnCalcular.setOnClickListener {

            val totalTemp = binding.editTotalConta.text
            val numPessoasTemp = binding.editNumeroPessoas.text

            if (totalTemp?.isEmpty() == true ||
                numPessoasTemp?.isEmpty() == true
            ) {
                Snackbar
                    .make(
                        binding.editTotalConta, "Preencha todos os campos",
                        Snackbar.LENGTH_LONG
                    )
                    .show()
            } else {
                val valorTotal: Float = totalTemp.toString().toFloat()
                val numeroPessoas: Int = numPessoasTemp.toString().toInt()

                val contaIndiv = valorTotal / numeroPessoas
                val tip = contaIndiv * percentage / 100

                val contaIndivTip = contaIndiv + tip

                binding.tVResult.text = "Conta com gorgeta: $contaIndivTip"

                println("Resultado " + contaIndivTip)

            }
        }

        binding.btbClean.setOnClickListener {

            binding.tVResult.text = ""
            binding.editTotalConta.setText ("")
            binding.editNumeroPessoas.setText("")
            binding.rbOption1.isChecked = false
            binding.rbOption2.isChecked = false
            binding.rbOption3.isChecked = false

        }
    }
}