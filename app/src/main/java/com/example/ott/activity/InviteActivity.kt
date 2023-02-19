package com.example.ott.activity

import android.content.Intent
import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import androidx.core.content.ContextCompat
import androidx.core.widget.addTextChangedListener
import com.example.ott.R
import com.example.ott.databinding.ActivityInviteBinding

class InviteActivity : AppCompatActivity() {
    private var binding: ActivityInviteBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInviteBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        invalidateEmail()
    }
    private fun invalidateEmail() {
        binding!!.email.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+".toRegex()
                val email = binding!!.email.text.toString()

                if (!email.matches(emailPattern)) {
                    binding!!.email.error = "oops! Enter Correct Email!"
                } else {
                    binding!!.invite.backgroundTintList = ColorStateList.valueOf(
                        ContextCompat.getColor(
                            this@InviteActivity,
                            R.color.btn_red
                        )
                    )
                    goToNext()
                    binding!!.email.error = null
                }
            }

            override fun afterTextChanged(p0: Editable?) {

            }
        })
    }
    private fun goToNext() {
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