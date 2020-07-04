package com.example.farmersfridgechallenge

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(val wordData: ArrayList<String>, val numberData: ArrayList<Int>): RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    // Connects word with items in layout
    class ViewHolder(item: View): RecyclerView.ViewHolder(item){

        val word = item.findViewById<TextView>(R.id.updatedWord)

    }

    // inflate layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return ViewHolder(v)
    }

    // gets number of items in adapter
    override fun getItemCount() = wordData.size

    // update text on UI
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.word.setText("${numberData.get(position)} ${wordData.get(position)}")
    }
}