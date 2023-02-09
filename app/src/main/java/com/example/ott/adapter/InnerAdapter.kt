package com.example.ott.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.netflixuiclone.data.MovieData
import com.example.ott.R
import com.example.ott.databinding.InnerRcItemViewBinding


class InnerAdapter(val list: List<MovieData>): RecyclerView.Adapter<InnerAdapter.InnerViewHolder>() {

    class InnerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val binding =  InnerRcItemViewBinding.bind(itemView)
        val img = binding.innerRcImageView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InnerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.inner_rc_item_view, parent,false)
        return InnerViewHolder(view)
    }

    override fun onBindViewHolder(holder: InnerViewHolder, position: Int) {
        println("hello")
        Glide.with(holder.itemView.context)
            .load(list[position].url)
            .into(holder.img)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}