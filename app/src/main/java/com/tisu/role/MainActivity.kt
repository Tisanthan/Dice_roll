package com.tisu.role

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById<Button>(R.id.roll_button)
        rollButton.setOnClickListener {
//            Toast.makeText(this, "button clicked", Toast.LENGTH_LONG).show()
            rolldias()
        }
        diceImage = findViewById(R.id.dice_image)
    }

    private fun rolldias() {
        val randomInt = Random.nextInt(6)+1
        val drawvleResource = when(randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

//        val diaceImage: ImageView = findViewById(R.id.dice_image)
        diceImage.setImageResource(drawvleResource)

    }
}

