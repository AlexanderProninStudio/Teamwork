package ru.alexpronin.teamowork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class KhusainovActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_khusainov)


        val btn: Button = findViewById(R.id.button)
        btn.setOnClickListener {
            btn.text = "Ура! Кнопка нажата!"
            }
        }
    }
