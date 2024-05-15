package com.example.biggernumbergame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {

    lateinit var leftButton: Button
    lateinit var rightButton: Button
    lateinit var layout: ConstraintLayout
    lateinit var points: TextView
    lateinit var winlose: TextView
    lateinit var restart: Button

    //var num1 = (-100..100).random()
    //var num2 = (-100..100).random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var score = 0

        if (score < 10) {
            var num1 = (-100..100).random()
            var num2 = (-100..100).random()

            //var num1 = 2
            //var num2 = 2

            if (num1 == num2) {
                num1 = (-100..100).random()
                num2 = (-100..100).random()
                leftButton.text = "$num1"
                rightButton.text = "$num2"
            }
            // left and right buttons
            leftButton = findViewById(R.id.button_main_left)
            leftButton.text = "$num1"
            rightButton = findViewById(R.id.button_main_right)
            rightButton.text = "$num2"
            points = findViewById(R.id.textview_main_score)
            points.text = "$score"
            winlose = findViewById(R.id.textview_main_winlose)
            winlose.text = ""
            restart = findViewById(R.id.button_main_restart)
            restart.text = ""
            restart.setBackgroundColor(0)

            // left and right counting
            leftButton.setOnClickListener {
                if (num1 > num2){
                    score++
                    if (score == 10) {
                        winlose.text = "Winner"
                    }
                    if (score == -10) {
                        winlose.text = "Utter Failure"
                    }
                }
                else{
                    //if (score > 0) {
                      //  score--
                    //}
                    score--
                    if (score == 10) {
                        winlose.text = "Winner"
                    }
                    if (score == -10) {
                        winlose.text = "Utter Failure"
                    }
                }
                num1 = (-100..100).random()
                num2 = (-100..100).random()
                leftButton.text = "$num1"
                rightButton.text = "$num2"
                points.text = "$score"
            }
            //leftButton.text = "$num1"
            //rightButton.text = "$num2"
            //points.text = "$score"
            rightButton.setOnClickListener {
                if (num2 > num1){
                    score++
                    if (score == 10) {
                        winlose.text = "Winner"
                        leftButton.text = "YAY!!"
                        rightButton.text = "YEAH!!"
                    }
                    if (score == -10) {
                        winlose.text = "Utter Failure"
                        leftButton.text = "NO!!"
                        rightButton.text = "SAD!!"
                    }
                }
                else{
                    //if (score > 0) {
                      //  score--
                    //}
                    score--
                    if (score == 10) {
                        winlose.text = "Winner"
                        leftButton.text = "YAY!!"
                        rightButton.text = "YEAH!!"
                    }
                    if (score == -10) {
                        winlose.text = "Utter Failure"
                        leftButton.text = "NO!!"
                        rightButton.text = "SAD!!"
                    }
                }
                num1 = (-100..100).random()
                num2 = (-100..100).random()
                leftButton.text = "$num1"
                rightButton.text = "$num2"
                points.text = "$score"
            }


            // points

            //points.text = "$score"
        }
        if (score == 10) {
            winlose.text = "Winner"
        }
        if (score == -10) {
            winlose.text = "Utter Failure"
        }

    }
}