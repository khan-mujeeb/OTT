package com.example.ott.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.netflixuiclone.data.setData.movieList
import com.example.ott.R

class HeaderAdapter(): RecyclerView.Adapter<HeaderAdapter.HeaderViewHolder>() {
    class HeaderViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val img = itemView.findViewById<ImageView>(R.id.header_img)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeaderViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(
                R.layout.header_item_view,
                parent,
                false
            )
        return HeaderViewHolder(view)
    }

    override fun onBindViewHolder(holder: HeaderViewHolder, position: Int) {

        val list = movieList()
        Glide.with(holder.itemView.context)
            .load(list[1].url)
            .into(holder.img)
//
//        binding!!.title.text = list[1].name
//        binding!!.genre.text = list[1].generic
    }

    override fun getItemCount(): Int {
        return 1
    }
}