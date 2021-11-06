package com.gmail.sjones.tp1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var imageView: ImageView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.image_view)
        button = findViewById(R.id.my_button)
        button.setOnClickListener(this)
        loadImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRc8rp-mtskOgky5nTQ9ky6ukU91Lr4FjhzWw&usqp=CAU")
    }

    override fun onClick(view: View) {
        val links = listOf(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQiVoiZydggUmHquDe6nc6zCJ6f5rxtcLK4Vw&usqp=CAU",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTuoYbZ4ZKBvdzKBU8kroO3S7Yzgk_TD_aCEA&usqp=CAU",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS0ft0ZilfNJ5aTX0e7xCwfjJf9C7vtuJizVQ&usqp=CAU",
                "https://www.vectorkhazana.com/assets/images/products/Smelly-Cat.jpg"
        )
        loadImage(links.random())
        Toast.makeText(this, "You click me", Toast.LENGTH_SHORT).show()
    }

    private fun loadImage(url: String) {
        Picasso.get()
            .load(url)
            .resize(600, 600)
            .centerCrop()
            .into(imageView)
    }
}
