package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun createButton(view: View) {

        val name = findViewById<EditText>(R.id.nameInput).editableText.toString()

        val intent = Intent(this, WishScreen::class.java)


        intent.putExtra("name_extra", name)
        startActivity(intent)
    }
}