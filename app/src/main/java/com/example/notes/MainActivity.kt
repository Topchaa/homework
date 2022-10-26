package com.example.notes

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var input:EditText
    private lateinit var btn : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val sharedPreference =  getSharedPreferences("sharedPreference", MODE_PRIVATE)


        input = findViewById(R.id.text)
        btn = findViewById(R.id.button)




    btn.setOnClickListener{


        }

    }


    }






