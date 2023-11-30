package com.example.tvporyadin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class QuestRecycler(val context: Context,val list:ArrayList<Quests>) : RecyclerView.Adapter<QuestRecycler.MyVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestRecycler.MyVH {
        val root = LayoutInflater.from(context).inflate(R.layout.adapter,parent,false)
        return MyVH(root)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: QuestRecycler.MyVH, position: Int) {
        holder.imageView.setImageResource(list[position].image)
        holder.title.setText(list[position].title)
        holder.descr.setText(list[position].text)
    }

    class MyVH(val itemView: View):RecyclerView.ViewHolder(itemView){
        val imageView:ImageView = itemView.findViewById(R.id.image_quests)
        val title:TextView = itemView.findViewById(R.id.title_quests)
        val descr:TextView = itemView.findViewById(R.id.descr)
    }


}