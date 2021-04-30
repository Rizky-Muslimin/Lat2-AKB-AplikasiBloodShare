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
class verify : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)

        val button = findViewById<Button>(R.id.btn_verifysend)
        button.setOnClickListener{
            val intent = Intent(this,profil::class.java)
            startActivity(intent)
        }
    }
}