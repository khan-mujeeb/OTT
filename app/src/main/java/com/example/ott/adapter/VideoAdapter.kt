package com.example.ott.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.netflixuiclone.data.MovieData
import com.example.ott.R
import com.example.ott.databinding.VideoRcViewBinding
import com.example.ott.ui.HomeFragment

class VideoAdapter(val list: List<MovieData>): RecyclerView.Adapter<VideoAdapter.InnerViewHolder>() {

    class InnerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val binding = VideoRcViewBinding.bind(itemView)
        val img = binding.videoImg
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InnerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.video_rc_view, parent,false)
        return InnerViewHolder(view)
    }

    override fun onBindViewHolder(holder: InnerViewHolder, position: Int) {

        Glide.with(holder.itemView.context)
            .load(list[position].url)
            .into(holder.img)

    }

    override fun getItemCount(): Int {
        return list.size
    }
}