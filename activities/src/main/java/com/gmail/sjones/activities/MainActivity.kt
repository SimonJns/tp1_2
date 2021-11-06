package com.gmail.sjones.activities

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var clickButton: Button
    private lateinit var textView: TextView
    private var nbClick = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        textView = findViewById(R.id.resultat)
        clickButton = findViewById(R.id.btn_click_me)
        clickButton.setOnClickListener {
            nbClick++
            val text = "Vous avez cliqué $nbClick fois !"
            textView.text = text

            if (nbClick >= 5) {
                clickButton.isEnabled = false
            }
        }
    }
    override fun onClick(view: View?) {
    }
}
