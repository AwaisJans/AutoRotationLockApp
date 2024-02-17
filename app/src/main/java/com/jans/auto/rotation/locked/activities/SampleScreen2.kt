package com.jans.auto.rotation.locked.activities

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.jans.auto.rotation.locked.R
import com.jans.auto.rotation.locked.utils.ConfigApp

class SampleScreen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act2)
        ConfigApp.isTablet(this)

        val imageView = findViewById<ImageView>(R.id.imgScreen)
        imageView.setImageResource(R.drawable.r1)



        val btnContinue = findViewById<TextView>(R.id.btnMain)
        btnContinue.setOnClickListener{
            val intent = Intent(this, SampleScreen3::class.java)
            startActivity(intent)
        }
    }


}