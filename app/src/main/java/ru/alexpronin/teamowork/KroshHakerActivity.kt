package ru.alexpronin.teamowork

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class KroshHakerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_krosh_haker)
        val torch: Button = findViewById(R.id.buttonTorch)
        val balView: TextView = findViewById(R.id.Score)
        val shop: Button = findViewById(R.id.shop)
        var bal: Int = 0
        var cost: Int = 500
        var u: Int = 0
        val myPrefs: SharedPreferences = application.applicationContext.getSharedPreferences("data", MODE_PRIVATE)
        bal = myPrefs.getInt("bal", 0)
        u = myPrefs.getInt("u", 0)
        cost = myPrefs.getInt("cost", 0)
        torch.setOnClickListener{
            bal += (1 + u)

            balView.text = "Баланс: $bal$"
            val myPrefs: SharedPreferences = application.applicationContext.getSharedPreferences("data", MODE_PRIVATE)
            val prefsEditor = myPrefs.edit()
            prefsEditor.putInt("bal", bal)
            prefsEditor.apply()

        }
        shop.setOnClickListener{
            if(bal >= cost){
                bal -= cost
                u++
                cost *= 2
                shop.text = "Купить улучшение (+${u+1})\nСтоимость: $cost$"
                val myPrefs: SharedPreferences = application.applicationContext.getSharedPreferences("data", MODE_PRIVATE)
                val prefsEditor = myPrefs.edit()
                prefsEditor.putInt("u", u)
                prefsEditor.putInt("cost", cost)
                prefsEditor.apply()
                Toast.makeText(applicationContext, "Вы купили улучшение.", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext, "Недостаточно средст.", Toast.LENGTH_SHORT).show()
            }
        }

    }
}