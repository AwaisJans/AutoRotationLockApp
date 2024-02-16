package com.jans.auto.rotation.locked

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class AdapterAutoRotationItems(private val rootItemList: List<String>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    lateinit var contextRootAdapter: Context


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.root_item_layout, parent, false)
        return AutoRotationViewHolder(view)
    }

    class AutoRotationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val rootTextViewBox: RelativeLayout = itemView.findViewById(R.id.root_title_text_view_box)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = rootItemList[position]
        contextRootAdapter = holder.itemView.context


        when (holder) {
            is AutoRotationViewHolder -> {

                val tv1 = holder.itemView.findViewById(R.id.rootTitleTextView) as TextView
                tv1.text = item

                holder.rootTextViewBox.setOnClickListener {
                    Toast.makeText(holder.itemView.context, item, Toast.LENGTH_SHORT).show()
                }

            }
        }
    }

    override fun getItemCount(): Int {
        return rootItemList.size
    }
}