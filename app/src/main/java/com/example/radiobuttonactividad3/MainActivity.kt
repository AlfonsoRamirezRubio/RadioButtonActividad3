package com.example.radiobuttonactividad3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {

    lateinit var txtResultado: textView
    lateinit var rdSuma: RadioButton
    lateinit var rdResta: RadioButton
    lateinit var rdMultiplicacion: RadioButton
    lateinit var rdDivision: RadioButton
    lateinit var num1: EditText
    lateinit var num2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtResultado = findViewById(R.id.txtResultado)
        rdSuma = findViewById(R.id.rdSuma)
        rdResta = findViewById(R.id.rdResta)
        rdMultiplicacion = findViewById(R.id.rdMultiplicacion)
        rdDivision = findViewById(R.id.rdMultiplicacion)
        num1 = findViewById(R.id.num1)
        num2 = findViewById(R.id.num2)


    }

    fun accionBotton(){
        val numerito1 = num1.text.toString().toInt()
        val numerito2 = num2.text.toString().toInt()
        var resultado = 0
        if (rdSuma.isChecked){

            resultado = numerito1 + numerito2

        }else if(rdResta.isChecked) {

            resultado = numerito1 - numerito2

        } else if(rdMultiplicacion.isChecked){

            resultado = numerito1 * numerito2

        }else if(rdDivision.isChecked){

            resultado = numerito1 / numerito2

        }
        txtResultado.text= "$resultado";

        }

    }

