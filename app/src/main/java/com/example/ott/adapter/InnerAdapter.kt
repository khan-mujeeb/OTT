package com.example.ott.adapter

import android.app.Activity
import android.app.ActivityOptions
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.netflixuiclone.data.MovieData
import com.example.ott.R
import com.example.ott.activity.DetailsActivity
import com.example.ott.databinding.InnerRcItemViewBinding
import com.example.ott.ui.HomeFragment
import com.example.ott.ui.HomeFragmentDirections


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

        Glide.with(holder.itemView.context)
            .load(list[position].url)
            .into(holder.img)

        holder.itemView.setOnClickListener {
            val context = holder.itemView.context as Activity?
//            val option: ActivityOptions = ActivityOptions.makeSceneTransitionAnimation(context, holder.itemView, "sharedName")
//
//            holder.itemView.context.startActivity(Intent(context, DetailsActivity::class.java), option.toBundle())
            Navigation.findNavController(it).navigate(
                HomeFragmentDirections.actionHomeFragmentToMediaDetailsFragment()

            )
        }
    }



    override fun getItemCount(): Int {
        return list.size
    }
}