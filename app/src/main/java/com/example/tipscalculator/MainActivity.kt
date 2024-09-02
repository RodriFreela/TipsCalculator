package com.example.tipscalculator

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tipscalculator.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        var percentage: Int = 0

        /* binding.optionOne.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
            }
        } */
        binding.optionTwo.setOnCheckedChangeListener { _, isChecked ->
            //println("Rodrigo option two: $isChecked")
            if (isChecked) {
                percentage = 5
            }
        }
        binding.optionThree.setOnCheckedChangeListener { _, isChecked ->
            //println("Rodrigo option three: $isChecked")
            if (isChecked) {
                percentage = 10
            }
        }
        binding.optionFour.setOnCheckedChangeListener { _, isChecked ->
            //println("Rodrigo option four: $isChecked")
            if (isChecked) {
                percentage = 15
            }
        }
        binding.optionFive.setOnCheckedChangeListener { _, isChecked ->
            //println("Rodrigo option five: $isChecked")
            if (isChecked) {
                percentage = 20
            }
        }

        binding.btnDone.setOnClickListener {
            val totalTableTemp = binding.tietValorMesa.text
            val numPessoasTemp = binding.tietNumPessoas.text

            if (totalTableTemp?.isEmpty() == true ||
                numPessoasTemp?.isEmpty() == true
            ) {
                Snackbar
                    .make(
                        binding.tietValorMesa,
                        "Preencha todos os campos",
                        Snackbar.LENGTH_LONG
                    )
                    .show()
            } else {
                val totalTable: Float = totalTableTemp.toString().toFloat()
                val numPessoas: Int = numPessoasTemp.toString().toInt()

                val totalTemp = totalTable / numPessoas
                val tips = totalTemp * percentage / 100
                var totalFinal: Float = totalTemp + tips

                binding.tvResultFinal.text = "$ $totalFinal"
               // binding.edtResultFinal.text.toString()= "$ $totalFinal"
            }
        }
        binding.btnClean.setOnClickListener{
            binding.tvResultFinal.text = ""
            //binding.edtResultFinal.text = ""
            binding.tietValorMesa.setText("")
            binding.tietNumPessoas.setText("")
           // binding.optionOne.isChecked = false
            binding.optionTwo.isChecked = false
            binding.optionThree.isChecked = false
            binding.optionFour.isChecked = false
            binding.optionFive.isChecked = false
        }
    }
}