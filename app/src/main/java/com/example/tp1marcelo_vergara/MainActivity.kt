package com.example.tp1marcelo_vergara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bttn_next.setOnClickListener{
            var intt = Intent(this, Lista::class.java)
            startActivity(intt)
        }
    }
}
