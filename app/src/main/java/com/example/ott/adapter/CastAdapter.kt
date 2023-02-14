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
import com.example.ott.databinding.CastImgBinding
import com.example.ott.ui.HomeFragment
import com.example.ott.ui.HomeFragmentDirections
import com.example.ott.ui.MediaDetailsFragmentDirections

class CastAdapter(val list: List<MovieData>): RecyclerView.Adapter<CastAdapter.InnerViewHolder>() {

    class InnerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val binding =  CastImgBinding.bind(itemView)
        val img = binding.castImg
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InnerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cast_img, parent,false)
        return InnerViewHolder(view)
    }

    override fun onBindViewHolder(holder: InnerViewHolder, position: Int) {

        Glide.with(holder.itemView.context)
            .load(list[position].url)
            .into(holder.img)

        holder.itemView.setOnClickListener {
            Navigation.findNavController(it).navigate(
                MediaDetailsFragmentDirections.actionMediaDetailsFragmentToCastDetailFragment()
            )
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }
}