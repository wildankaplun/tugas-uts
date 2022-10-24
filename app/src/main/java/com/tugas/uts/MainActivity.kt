package com.tugas.uts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonTambah: Button = findViewById(R.id.btnTambah)
        val buttonKurang: Button = findViewById(R.id.btnKurang)
        val buttonKali: Button = findViewById(R.id.btnKali)
        val buttonBagi: Button = findViewById(R.id.btnBagi)

        buttonTambah.setOnClickListener() {
            penjumlahanAngka()
        }
        buttonKurang.setOnClickListener() {
            penguranganAngka()
        }
        buttonKali.setOnClickListener() {
            perkalianAngka()
        }
        buttonBagi.setOnClickListener() {
            pembagianAngka()
        }
    }
    private fun penjumlahanAngka() {
        val txtInput1: EditText = findViewById(R.id.txtInput1)
        val txtInput2: EditText = findViewById(R.id.txtInput2)
        val txtResult: TextView = findViewById(R.id.txtViewResult)

        val input1 = txtInput1.text.toString().trim()
        val input2 = txtInput2.text.toString().trim()

        var isEmptyField = false
        if (input1.isEmpty()) {
            isEmptyField = true;
            txtInput1.error = "Input 1 harus diisi angka (0-9)"
        }
        if (input2.isEmpty()) {
            isEmptyField = true
            txtInput2.error = "Input 2 harus diisi angka (0-9)"
        }
        if (!isEmptyField) {
            val result = input1.toInt() + input2.toInt()
            txtResult.text = result.toString()
        }
    }
    private fun penguranganAngka() {
        val txtInput1: EditText = findViewById(R.id.txtInput1)
        val txtInput2: EditText = findViewById(R.id.txtInput2)
        val txtResult: TextView = findViewById(R.id.txtViewResult)

        val input1 = txtInput1.text.toString().trim()
        val input2 = txtInput2.text.toString().trim()

        var isEmptyField = false
        if (input1.isEmpty()) {
            isEmptyField = true;
            txtInput1.error = "Input 1 harus diisi angka (0-9)"
        }
        if (input2.isEmpty()) {
            isEmptyField = true
            txtInput2.error = "Input 2 harus diisi angka (0-9)"
        }
        if (!isEmptyField) {
            val result = input1.toInt() - input2.toInt()
            txtResult.text = result.toString()
        }
    }
    private fun perkalianAngka() {
        val txtInput1: EditText = findViewById(R.id.txtInput1)
        val txtInput2: EditText = findViewById(R.id.txtInput2)
        val txtResult: TextView = findViewById(R.id.txtViewResult)

        val input1 = txtInput1.text.toString().trim()
        val input2 = txtInput2.text.toString().trim()

        var isEmptyField = false
        if (input1.isEmpty()) {
            isEmptyField = true;
            txtInput1.error = "Input 1 harus diisi angka (0-9)"
        }
        if (input2.isEmpty()) {
            isEmptyField = true
            txtInput2.error = "Input 2 harus diisi angka (0-9)"
        }
        if (!isEmptyField) {
            val result = input1.toInt() * input2.toInt()
            txtResult.text = result.toString()
        }
    }
    private fun pembagianAngka() {
        val txtInput1: EditText = findViewById(R.id.txtInput1)
        val txtInput2: EditText = findViewById(R.id.txtInput2)
        val txtResult: TextView = findViewById(R.id.txtViewResult)

        val input1 = txtInput1.text.toString().trim()
        val input2 = txtInput2.text.toString().trim()

        var isEmptyField = false
        if (input1.isEmpty()) {
            isEmptyField = true;
            txtInput1.error = "Input 1 harus diisi angka (0-9)"
        }
        if (input2.isEmpty()) {
            isEmptyField = true
            txtInput2.error = "Input 2 harus diisi angka (0-9)"
        }
        if (!isEmptyField) {
            val result = input1.toInt() / input2.toInt()
            txtResult.text = result.toString()
        }
    }
}