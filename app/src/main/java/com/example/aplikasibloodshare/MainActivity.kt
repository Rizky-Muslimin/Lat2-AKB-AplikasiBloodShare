package com.example.aplikasibloodshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
//Nama : Rizky Muslimin
//Kelas : IF-1
//NIM : 10118002
//Matkul : AKB
//Tanggal pengerjaan : 29 & 30 april 2021
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clicktext = findViewById<TextView>(R.id.txt_homeregister)
        clicktext.setOnClickListener{
            val intent = Intent(this,register::class.java)
            startActivity(intent)
        }
    }
}