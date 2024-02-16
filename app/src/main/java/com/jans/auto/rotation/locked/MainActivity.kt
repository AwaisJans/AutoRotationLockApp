package com.jans.auto.rotation.locked

import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var rv1: RecyclerView
    private lateinit var items: List<String>


    private fun isTablet(): Boolean {
        val xlarge =
            resources.configuration.screenLayout and Configuration.SCREENLAYOUT_SIZE_MASK === 4
        val large =
            resources.configuration.screenLayout and Configuration.SCREENLAYOUT_SIZE_MASK === Configuration.SCREENLAYOUT_SIZE_LARGE
        return xlarge || large
    }


    @SuppressLint("SourceLockedOrientationActivity")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        if(isTablet()){
            Toast.makeText(this, "Tablet", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this, "not a tablet", Toast.LENGTH_SHORT).show()
            // Lock Orientation
            requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        }


        rv1 = findViewById(R.id.recyclerView)


        items = listOf("ahmadjahanamanimransagarsohailharoonahmadjahanamanimransagarsohailharoon",
            "jahanahmadjahanamanimransagarsohailharooahmadjahanamanimransagarsohailharoonn",
            "amanahmadahmadjahanamanimransagarsohailharoonjahanamanimransagarsohailharoon",
            "imranahmaahmadjahanamanimransagarsohailharoondjahanamanimransagarsohailharoon",
            "sagarahmahmadjahanamanimransagarsohailharoonadjahanamanimransagarsohailharoon",
            "jahanahmahmadjahanamanimransagarsohailharoonadjahanamanimransagarsohailharoon",
            "amanahmahmadjahanamanimransagarsohailharoonadjahanamanimransagarsohailharoon",
            "imranahmahmadjahanamanimransagarsohailharoonadjahanamanimransagarsohailharoon",
            "sagarahmahmadjahanamanimransagarsohailharoonadjahanamanimransagarsohailharoon",
            "jahanahmahmadjahanamanimransagarsohailharoonadjahanamanimransagarsohailharoon",
            "amanahmahmadjahanamanimransagarsohailharoonadjahanamanimransagarsohailharoon",
            "imrahmadjahanamanimransagarsohailharoonanahmadjahanamanimransagarsohailharoon",
            "sagaahmadjahanamanimransagarsohailharoonrahmadjahanamanimransagarsohailharoon",
            "jahaahmadjahanamanimransagarsohailharoonnahmadjahanamanimransagarsohailharoon",
            "amanahahmadjahanamanimransagarsohailharoonmadjahanamanimransagarsohailharoon",
            "imranahmahmadjahanamanimransagarsohailharoonadjahanamanimransagarsohailharoon",
            "sagarahmaahmadjahanamanimransagarsohailharoondjahanamanimransagarsohailharoon",
            "jahanahmadjahvahmadjahanamanimransagarsohailharoonanamanimransagarsohailharoon",
            "amanahmadjahanamanimransagarsahmadjahanamanimransagarsohailharoonohailharoon",
            "imranahmadjahanamanimransagaahmadjahanamanimransagarsohailharoonrsohailharoon",
            "sagarahmadjahanamanimransaahmadjahanamanimransagarsohailharoongarsohailharoon",
            "jahanahmadjahanamanimranvahmadjahanamanimransagarsohailharoonsagarsohailharoon",
            "amanahmadjahanamanimranahmadjahanamanimransagarsohailharoonsagarsohailharoon",
            "imranahmadjahanamanimrahmadjahanamanimransagarsohailharoonansagarsohailharoon",
            "sagarahmadjahanamanimahmadjahanamanimransagarsohailharoonransagarsohailharoon",
            "jahanahmadjahanamanimahmadjahanamanimransagarsohailharoonransagarsohailharoon",
            "amanahmadjahanamanimahmadjahanamanimransagarsohailharoonransagarsohailharoon",
            "imranahmadjahanamanahmadjahanamanimransagarsohailharoonimransagarsohailharoon",
            "sagarahmadjahanamaahmadjahanamanimransagarsohailharoonnimransagarsohailharoon",
            "jahanahmadjahanamaahmadjahanamanimransagarsohailharoonnimransagarsohailharoon",
            "amanahmadjahanamanahmadjahanamanimransagarsohailharoonimransagarsohailharoon",
            "imranahmadjahanaahmadjahanamanimransagarsohailharoonmanimransagarsohailharoon",
            "sagarahmadjahaahmadjahanamanimransagarsohailharoonnamanimransagarsohailharoon",
            "jahanahmadjahanahmadjahanamanimransagarsohailharoonamanimransagarsohailharoon",
            "amanahmadjahanahmadjahanamanimransagarsohailharoonamanimransagarsohailharoon",
            "imranahmadjahanahmadjahanamanimransagarsohailharoonamanimransagarsohailharoon",
            "sagarahmadjahaahmadjahanamanimransagarsohailharoonnamanimransagarsohailharoon",
            "sohailahmadjahanamanimraahmadjahanamanimransagarsohailharoonnsagarsohailharoon",
            "haroonahmadjahaahmadjahanamanimransagarsohailharoonnamanimransagarsohailharoon")



        rv1.layoutManager = GridLayoutManager(this,3)
        val adapter = AdapterAutoRotationItems(items)
        rv1.adapter = adapter


    }



}