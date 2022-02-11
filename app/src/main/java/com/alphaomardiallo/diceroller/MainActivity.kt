package com.alphaomardiallo.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultImageView: ImageView = findViewById(R.id.imageView)
        resultImageView.setImageResource(setImage(diceRoll))
        resultImageView.contentDescription = diceRoll.toString()

        val dice2 = Dice(6)
        val diceRoll2 = dice2.roll()
        val resultImageView2: ImageView = findViewById(R.id.imageView2)
        resultImageView2.setImageResource(setImage(diceRoll2))
        resultImageView2.contentDescription = diceRoll2.toString()
    }

    private fun setImage(dice: Int): Int {
        var image: Int = 0
        when (dice) {
            1 -> image = R.drawable.dice_1
            2 -> image = R.drawable.dice_2
            3 -> image = R.drawable.dice_3
            4 -> image = R.drawable.dice_4
            5 -> image = R.drawable.dice_5
            6 -> image = R.drawable.dice_6
        }
        return image
    }
}