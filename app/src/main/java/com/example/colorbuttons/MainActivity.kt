package com.example.colorbuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var clickRed="Red"
    var clickGreen="Green"
    var clickBlue="Blue"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ClickColorDisplayView = findViewById<TextView>(R.id.colorDisplay)
        val clickRedButton = findViewById<TextView>(R.id.redColor)
        val clickGreenButton = findViewById<TextView>(R.id.greenColor)
        val clickBlueButton = findViewById<TextView>(R.id.blueColor)

        clickRedButton.setOnClickListener {
            ClickColorDisplayView.text="$clickRed is selected"
        }

        clickGreenButton.setOnClickListener {
            ClickColorDisplayView.text="$clickGreen is selected"
        }

        clickBlueButton.setOnClickListener {
            ClickColorDisplayView.text="$clickBlue is selected"
        }

    }
}