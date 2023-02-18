package com.example.ott.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import androidx.core.widget.addTextChangedListener
import com.example.ott.R
import com.example.ott.databinding.ActivityInviteBinding

class InviteActivity : AppCompatActivity() {
    private var binding: ActivityInviteBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInviteBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        binding!!.email.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                binding!!.invite.isEnabled =true;
            }

            override fun afterTextChanged(p0: Editable?) {

            }
        })
        binding!!.invite.setOnClickListener {
            startActivity(Intent(this, NextActivity::class.java))
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