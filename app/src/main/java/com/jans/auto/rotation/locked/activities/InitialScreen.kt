package com.jans.auto.rotation.locked.activities

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.jans.auto.rotation.locked.R
import com.jans.auto.rotation.locked.utils.ConfigApp.Companion.isTablet

class InitialScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_initial)
        isTablet(this)







        val btnContinue = findViewById<TextView>(R.id.btnMain)
        btnContinue.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)

        }

    }

}