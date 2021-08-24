package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class WishScreen : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wish_screen)

        val name = intent.getStringExtra(NAME_EXTRA)

        findViewById<TextView>(R.id.wish).text = "Happy Birthday $name"
    }
}