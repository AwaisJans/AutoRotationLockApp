package com.jans.auto.rotation.locked.adapters

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jans.auto.rotation.locked.R
import com.jans.auto.rotation.locked.activities.SampleScreen2

class AdapterAutoRotationItems(private val rootItemList: List<String>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.my_rv_layout, parent, false)
        return AutoRotationViewHolder(view)
    }

    class AutoRotationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val rootTextViewBox: RelativeLayout = itemView.findViewById(R.id.root_title_text_view_box)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = rootItemList[position]
        context = holder.itemView.context


        when (holder) {
            is AutoRotationViewHolder -> {
                val tv1 = holder.itemView.findViewById(R.id.rootTitleTextView) as TextView
                tv1.text = item

                holder.rootTextViewBox.setOnClickListener {
                    context.startActivity(Intent(context, SampleScreen2::class.java))

                }
            }
        }
    }

    override fun getItemCount(): Int {
        return rootItemList.size
    }
}