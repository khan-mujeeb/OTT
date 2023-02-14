package com.example.ott.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ott.R
import com.example.ott.databinding.FragmentCastDetailBinding
import com.example.ott.databinding.FragmentHomeBinding

class CastDetailFragment : Fragment() {


    var binding: FragmentCastDetailBinding? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentCastDetailBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding!!.root
    }

    override fun onDestroy() {
        super.onDestroy()
        if (binding!=null) {
            binding = null
        }
    }


}