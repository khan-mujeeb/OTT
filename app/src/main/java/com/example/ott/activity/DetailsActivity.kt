package com.example.ott.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ott.R
import com.example.ott.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}