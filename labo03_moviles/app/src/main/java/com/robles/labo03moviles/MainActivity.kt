package com.robles.labo03moviles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import java.math.RoundingMode
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private lateinit var moneyAmountTextView: TextView
    private lateinit var fiveCentsImageView: ImageView
    private lateinit var tenCentsImageView: ImageView
    private lateinit var twentyFiveCentsImageView: ImageView
    private lateinit var oneDollarImageView: ImageView
    private var moneyCount: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()
        addListeners()
    }

    private fun bind(){
        moneyAmountTextView = findViewById(R.id.count_textView)
        fiveCentsImageView = findViewById(R.id.five_cents_image_view)
        tenCentsImageView = findViewById(R.id.ten_cents_image_view)
        twentyFiveCentsImageView = findViewById(R.id.twenty_five_image_view)
        oneDollarImageView = findViewById(R.id.one_dollar_image_view)
    }
    private fun addListeners(){
        fiveCentsImageView.setOnClickListener(){
            moneyCount+=(0.05*100.0).roundToInt()/100.0
            moneyAmountTextView.text = ((moneyCount*100.0).toInt()/100.0).toString()
        }
        tenCentsImageView.setOnClickListener(){
            moneyCount+= (0.10*100.0).roundToInt()/100.0
            moneyAmountTextView.text = ((moneyCount*100.0).toInt()/100.0).toString()
        }
        twentyFiveCentsImageView.setOnClickListener(){
            moneyCount+= (0.25*100.0).roundToInt()/100.0
            moneyAmountTextView.text = ((moneyCount*100.0).toInt()/100.0).toString()
        }
        oneDollarImageView.setOnClickListener(){
            moneyCount+= (1.00*100.0).roundToInt()/100.0
            moneyAmountTextView.text = ((moneyCount*100.0).toInt()/100.0).toString()
        }
    }
}