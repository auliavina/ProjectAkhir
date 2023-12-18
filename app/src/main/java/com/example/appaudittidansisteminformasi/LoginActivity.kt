package com.example.appaudittidansisteminformasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.appaudittidansisteminformasi.api.ApiConfig
import com.example.appaudittidansisteminformasi.databinding.ActivityMainBinding
import com.example.appaudittidansisteminformasi.model.ResponModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val loginButton = findViewById<Button>(R.id.login_botton2)
        val register = findViewById<TextView>(R.id.textButtonRegister)

        loginButton.setOnClickListener {
            masuk()
        }

        register.setOnClickListener(View.OnClickListener {
            val register = Intent(this, RegisterActivity::class.java)
            startActivity(register)
        })

    }

    fun masuk() {
        val emaiEdit  = findViewById<EditText>(R.id.enterEmailLogin1)
        val passwordEdit  = findViewById<EditText>(R.id.enterPasswordLogin1)

        if (emaiEdit.text.isEmpty()) {
            emaiEdit.error = "Username Wajib Di isi!"
            emaiEdit.requestFocus()
            return
        } else if (passwordEdit.text.isEmpty()) {
            passwordEdit.error = "Password Wajib Di isi!"
            passwordEdit.requestFocus()
            return
        }

        ApiConfig.instanceRetrofit.login(emaiEdit.text.toString(),passwordEdit.text.toString()).enqueue(object :
            Callback<ResponModel> {


            override fun onResponse(call: Call<ResponModel>, response: Response<ResponModel>) {
                val respon =response.body() !!
                if (respon.status == 200){
                    Toast.makeText(this@LoginActivity, "Login Berhasil, Gass Ke Beranda", Toast.LENGTH_SHORT).show()
                    Handler(Looper.getMainLooper()).postDelayed({
                        val intent = Intent(this@LoginActivity,MainActivity::class.java)
                        startActivity(intent)
                        finish()  // Menutup aktivitas saat ini agar pengguna tidak dapat kembali ke halaman pendaftaran
                    }, 2000)

                }else {
                    Toast.makeText(this@LoginActivity, respon.message, Toast.LENGTH_SHORT).show()

                }
            }
            override fun onFailure(call: Call<ResponModel>, t: Throwable) {
                Toast.makeText(this@LoginActivity, "Error:" + t.message, Toast.LENGTH_SHORT).show()
            }


        })


    }

}