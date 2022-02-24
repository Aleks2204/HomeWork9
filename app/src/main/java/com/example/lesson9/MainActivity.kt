package com.example.lesson9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listOfMotiv = listOf<String>(
            "Молодец!", "Так держать!", "Ты справишься!", "Умничка!", "Люблю тебя!",
            "Еще чуть-чуть и все получится!", "Ты моя любовь!"
        )

        var key = 0
        tvMotivation.text = listOfMotiv[key]

        btnAppend.setOnClickListener {
            if (key == listOfMotiv.count() - 1) key = 0
            else key += 1
            tvMotivation.text = listOfMotiv[key]
        }
    }
}


