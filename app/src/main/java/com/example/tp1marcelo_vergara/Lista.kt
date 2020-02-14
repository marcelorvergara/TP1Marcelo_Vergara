package com.example.tp1marcelo_vergara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lista.*
import kotlinx.android.synthetic.main.activity_main.*

class Lista : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        bttn_ok.setOnClickListener{
            var intt = Intent(this, MainActivity::class.java)
            startActivity(intt)
        }
    }
}
