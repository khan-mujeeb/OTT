package com.example.ott.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.ott.R
import com.example.ott.databinding.OuterRcItemViewBinding
import com.example.ott.databinding.TempBinding
import com.example.ott.temp_data.outterList
import com.example.ott.ui.HomeFragment

class OutterAdapter(val list: List<outterList>): RecyclerView.Adapter<OutterAdapter.OuterViewHolder>() {

     class OuterViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val binding =  OuterRcItemViewBinding.bind(itemView)
        val title = binding.categoryTitle
        val inner_rc = binding.innerRc
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OuterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.outer_rc_item_view, parent,false)
        return OuterViewHolder(view)
    }

    override fun onBindViewHolder(holder: OuterViewHolder, position: Int) {
        holder.title.text = list[position].title
        val adapter = InnerAdapter(list[position].movies)
        holder.inner_rc.adapter = adapter


        
    }

    override fun getItemCount(): Int {
        return list.size
    }
}