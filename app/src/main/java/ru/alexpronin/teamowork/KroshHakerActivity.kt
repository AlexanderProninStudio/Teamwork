package ru.alexpronin.teamowork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class KroshHakerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_krosh_haker)
        val torch: Button = findViewById(R.id.buttonTorch)
        val scoreView: TextView = findViewById(R.id.Score)
        var score: Int = 0
        torch.setOnClickListener{
            score = score + 1
            scoreView.text = "Счёт: " + score.toString()
        }
    }
}