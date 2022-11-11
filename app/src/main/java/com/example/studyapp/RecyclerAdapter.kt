package com.example.studyapp

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_item.view.*

class RecyclerAdapter(val activity: Activity, private val lessons: ArrayList<ArrayList<String>>, private val image : Int) :
    RecyclerView.Adapter<RecyclerAdapter.ItemViewHolder>() {
    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.card_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        holder.itemView.apply {
            topic.text = lessons[position][0]
            topicDescription.text = lessons[position][1]
            topicLogo.setImageResource(image)
            card_item.setOnClickListener{ CustomAlertDialog(activity,lessons[position][1],lessons[position][2])}
        }
    }

    override fun getItemCount(): Int = lessons.size
}