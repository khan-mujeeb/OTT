package com.example.ott.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.netflixuiclone.data.setData.movieList
import com.example.ott.R
import com.example.ott.adapter.InnerAdapter
import com.example.ott.databinding.FragmentCastDetailBinding
import com.example.ott.databinding.FragmentHomeBinding

class CastDetailFragment : Fragment() {


    var binding: FragmentCastDetailBinding? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentCastDetailBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment

        // header image
        Glide.with(requireContext())
            .load("https://assets.vogue.in/photos/5d81e9680757f000087797c0/2:3/w_1920,c_limit/f.jpg")
            .into(binding!!.castHeaderImg)

        // cast profile picture
        Glide.with(requireContext())
            .load("https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Robert_Downey_Jr_2014_Comic_Con_%28cropped%29.jpg/634px-Robert_Downey_Jr_2014_Comic_Con_%28cropped%29.jpg")
            .into(binding!!.castProfileImg)

        // recycler view
        val adapter = InnerAdapter(movieList())
        binding!!.knownForRc.adapter = adapter



        return binding!!.root
    }

    override fun onDestroy() {
        super.onDestroy()
        if (binding!=null) {
            binding = null
        }
    }


}