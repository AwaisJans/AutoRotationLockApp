package com.jans.auto.rotation.locked.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jans.auto.rotation.locked.R
import com.jans.auto.rotation.locked.adapters.AdapterAutoRotationItems
import com.jans.auto.rotation.locked.utils.ConfigApp


class MainActivity : AppCompatActivity() {

    private lateinit var rv1: RecyclerView
    private lateinit var items: List<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ConfigApp.isTablet(this)

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