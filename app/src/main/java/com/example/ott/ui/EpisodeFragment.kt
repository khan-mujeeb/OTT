package com.example.ott.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.netflixuiclone.data.setData
import com.example.ott.R
import com.example.ott.adapter.VideoAdapter
import com.example.ott.databinding.FragmentEpisodeBinding


class EpisodeFragment : Fragment() {
    // TODO: Rename and change types of parameters



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        var binding =FragmentEpisodeBinding.inflate(layoutInflater)
        val list = setData.movieList()
        val adapter1 = VideoAdapter(list)
        binding.episodeList.adapter=adapter1
        // Inflate the layout for this fragment
        return binding.root
    }


}