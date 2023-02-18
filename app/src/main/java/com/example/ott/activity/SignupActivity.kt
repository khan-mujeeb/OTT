package com.example.ott.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ott.R
import com.example.ott.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    private var binding: ActivitySignupBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        binding!!.verify.setOnClickListener {
            startActivity(Intent(this, OtpActivity::class.java))
            finish()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        if (binding != null) {
            binding = null
        }
    }
}