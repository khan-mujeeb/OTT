package com.example.ott.activity

import android.R.attr.editable
import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color.red
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.ott.R
import com.example.ott.databinding.ActivitySignupBinding
import java.util.regex.Matcher
import java.util.regex.Pattern


class SignupActivity : AppCompatActivity() {
    private var binding: ActivitySignupBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        invalidateEmail()

    }

    private fun invalidateEmail() {
        binding!!.email.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

            @SuppressLint("UseCompatLoadingForDrawables")
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+".toRegex()
                val email = binding!!.email.text.toString()

                if (!email.matches(emailPattern)) {
                    binding!!.email.error = "Invalid email address"
                } else {
                    binding!!.verify.backgroundTintList = ColorStateList.valueOf(
                        ContextCompat.getColor(
                            this@SignupActivity,
                            R.color.btn_red
                        )
                    )
                    goToOtp()
                    binding!!.email.error = null
                }
            }
        })
    }

    private fun goToOtp() {
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