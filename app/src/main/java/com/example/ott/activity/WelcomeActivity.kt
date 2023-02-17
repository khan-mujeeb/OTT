package com.example.ott.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ott.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    private var binding: ActivityWelcomeBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        binding!!.signup.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)

        }
    }
    override fun onDestroy() {
        super.onDestroy()
        if (binding!=null) {
            binding = null
        }
    }
}