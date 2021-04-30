package com.example.aplikasibloodshare

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

//Nama : Rizky Muslimin
//Kelas : IF-1
//NIM : 10118002
//Matkul : AKB
//Tanggal pengerjaan : 30 april 2021
class hampir : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hampir)

        val button = findViewById<Button>(R.id.btn_verify)
        button.setOnClickListener{
            val intent = Intent(this,verify::class.java)
            startActivity(intent)
        }
    }
}