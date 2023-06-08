package ru.alexpronin.teamowork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val hasanov: Button = findViewById(R.id.button_hasanov)
        hasanov.setOnClickListener {
            val intent = Intent(this@MainActivity, HasanovActivity::class.java)
            startActivity(intent)
        }
        val khusainov: Button = findViewById(R.id.button_khusainov)
        khusainov.setOnClickListener {
            val intent = Intent(this@MainActivity, KhusainovActivity::class.java)
            startActivity(intent)
        }
        val kiamov: Button = findViewById(R.id.button_kiamov)
        kiamov.setOnClickListener {
            val intent = Intent(this@MainActivity, KiamovActivity::class.java)
            startActivity(intent)
        }
        val kolesnikov: Button = findViewById(R.id.button_kolesnikov)
        kolesnikov.setOnClickListener {
            val intent = Intent(this@MainActivity, KolesnikovActivity::class.java)
            startActivity(intent)
        }
        val kroshaker: Button = findViewById(R.id.button_kroshaker)
        kroshaker.setOnClickListener {
            val intent = Intent(this@MainActivity, KroshHakerActivity::class.java)
            startActivity(intent)
        }
        val pronin2: Button = findViewById(R.id.button_pronin2)
        pronin2.setOnClickListener {
            val intent = Intent(this@MainActivity, Pronin2Activity::class.java)
            startActivity(intent)
        }
        val slobodianiuk: Button = findViewById(R.id.button_slobodianiuk)
        slobodianiuk.setOnClickListener {
            val intent = Intent(this@MainActivity, SlobodianiukActivity::class.java)
            startActivity(intent)
        }

    }
}