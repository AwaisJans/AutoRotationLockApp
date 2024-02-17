package com.jans.auto.rotation.locked.activities

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.jans.auto.rotation.locked.R
import com.jans.auto.rotation.locked.utils.ConfigApp

class SampleScreen3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act2)
        ConfigApp.isTablet(this)

        val imageView = findViewById<ImageView>(R.id.imgScreen)
        imageView.setImageResource(R.drawable.example_a)

        val btnContinue = findViewById<TextView>(R.id.btnMain)
        btnContinue.setOnClickListener {
            val intent = Intent(this, SampleScreen4::class.java)
            startActivity(intent)
        }

    }


}