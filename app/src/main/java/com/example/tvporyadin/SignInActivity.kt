package com.example.tvporyadin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.FragmentActivity

class SignInActivity : FragmentActivity() {
    lateinit var email:EditText
    lateinit var password:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
    }

    fun Login(view: View) {

        if(email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()){
            val intent = Intent(this,QuestsActivity::class.java)
            startActivity(intent)
        }
        else{
            Toast.makeText(this,"Заполните все поля",Toast.LENGTH_LONG).show()

        }

    }
}