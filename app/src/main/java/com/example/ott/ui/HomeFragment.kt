package com.example.ott.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.netflixuiclone.data.setData.getOuterList
import com.example.ott.R
import com.example.ott.adapter.HeaderAdapter
import com.example.ott.adapter.OutterAdapter
import com.example.ott.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var binding: FragmentHomeBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)


//        setMovieData()
        setRc()

        // Inflate the layout for this fragment
        return binding!!.root
    }

//    private fun setMovieData() {
//        val list = movieList()
//        Glide.with(this)
//            .load(list[1].url)
//            .into(binding!!.headerImg)
//
//        binding!!.title.text = list[1].name
//        binding!!.genre.text = list[1].generic
//    }

    private fun setRc() {
        val headerAdapter = HeaderAdapter()
        val list2 = getOuterList()
        val adapter = OutterAdapter(list2)
        val concatAdapter = ConcatAdapter(headerAdapter, adapter)
        binding!!.outerRc.adapter = concatAdapter

        binding!!.outerRc.addOnScrollListener(object: RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                if (dy>0) {

                    binding!!.stickbarLayout.setVisibility(View.INVISIBLE)
                    binding!!.topSearchLayout.background = ContextCompat.getDrawable(requireContext(), R.color.black_transparent)


                }else {
                    binding!!.stickbarLayout.visibility = View.VISIBLE
                    binding!!.topSearchLayout.background = ContextCompat.getDrawable(requireContext(), R.color.transparent)
                }
            }
        })
    }

    override fun onDestroy() {
        super.onDestroy()
        if (binding!=null) {
            binding = null
        }
    }


}