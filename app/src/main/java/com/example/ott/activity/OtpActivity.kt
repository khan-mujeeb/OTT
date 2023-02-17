package com.example.ott.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.example.ott.R
import com.example.ott.databinding.ActivityOtpBinding

class OtpActivity : AppCompatActivity() {
    private var binding: ActivityOtpBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtpBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        setUpOtpInput()
    }

    private fun setUpOtpInput() {
        binding!!.one.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding!!.two.requestFocus()
            }

            override fun afterTextChanged(s: Editable?) {

            }

        })
        binding!!.two.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding!!.three.requestFocus()
            }

            override fun afterTextChanged(s: Editable?) {

            }

        })
        binding!!.three.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding!!.four.requestFocus()
            }

            override fun afterTextChanged(s: Editable?) {

            }

        })

    }
}
