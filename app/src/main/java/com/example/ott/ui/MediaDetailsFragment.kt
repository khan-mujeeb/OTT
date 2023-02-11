package com.example.ott.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ConcatAdapter
import com.bumptech.glide.Glide
import com.example.netflixuiclone.data.setData
import com.example.netflixuiclone.data.setData.getOuterList
import com.example.netflixuiclone.data.setData.movieList
import com.example.ott.R
import com.example.ott.adapter.HeaderAdapter
import com.example.ott.adapter.InnerAdapter
import com.example.ott.adapter.OutterAdapter
import com.example.ott.databinding.FragmentHomeBinding
import com.example.ott.databinding.FragmentMediaDetailsBinding


class MediaDetailsFragment : Fragment() {
    private var binding: FragmentHomeBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)

        setRc()
        // Inflate the layout for this fragment
        return binding!!.root

    }
    private fun setRc() {
        val headerAdapter = HeaderAdapter()
        val list2 = getOuterList()
        val adapter = OutterAdapter(list2)
        val concatAdapter = ConcatAdapter(headerAdapter, adapter)
        binding!!.outerRc.adapter = concatAdapter
    }
    override fun onDestroy() {
        super.onDestroy()
        if (binding!=null) {
            binding = null
        }
    }

}