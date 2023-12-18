package com.example.appaudittidansisteminformasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val register_botton: Button = findViewById(R.id.register_botton)
        register_botton.setOnClickListener(this)

        val textButtonLogin: TextView = findViewById(R.id.textButtonLogin)
        textButtonLogin.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null){
            when(v.id){
                R.id.register_botton -> {
                    val pindahIntent = Intent(this, LoginActivity::class.java)
                    startActivity(pindahIntent)
                }
            }
        }

        if (v != null){
            when(v.id){
                R.id.textButtonLogin -> {
                    val pindahIntent = Intent(this, LoginActivity::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}