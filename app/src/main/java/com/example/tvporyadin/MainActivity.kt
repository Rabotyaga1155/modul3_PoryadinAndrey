package com.example.tvporyadin

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.FragmentActivity


class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val timer  = object:CountDownTimer(3000,1000)
        {

            override fun onTick(millisUntilFinished:Long){

            }
            override fun onFinish(){
                val intent = Intent(this@MainActivity,SignInActivity::class.java)
                startActivity(intent)
                finish()
            }

        }
        timer.start()



    }
}