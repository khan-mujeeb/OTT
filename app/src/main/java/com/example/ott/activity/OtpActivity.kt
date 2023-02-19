package com.example.ott.activity

import android.content.Intent
import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.core.content.ContextCompat
import com.example.ott.R
import com.example.ott.databinding.ActivityOtpBinding

class OtpActivity : AppCompatActivity() {
    private var binding: ActivityOtpBinding? = null
    var countVal = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtpBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        setUpOtpInput()
        binding!!.verify.setOnClickListener{startActivity(
            Intent(this,UserNameActivity::class.java)
        )}


    }

    private fun setUpOtpInput() {
        binding!!.one.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                countVal++
                binding!!.two.requestFocus()
            }

            override fun afterTextChanged(s: Editable?) {
                if (countVal==4) {
                    binding!!.verify.backgroundTintList = ColorStateList.valueOf(
                        ContextCompat.getColor(
                            this@OtpActivity,
                            R.color.btn_red
                        )
                    )
                }
            }

        })
        binding!!.two.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                countVal++
                binding!!.three.requestFocus()
            }

            override fun afterTextChanged(s: Editable?) {
                if (countVal==4) {
                    binding!!.verify.backgroundTintList = ColorStateList.valueOf(
                        ContextCompat.getColor(
                            this@OtpActivity,
                            R.color.btn_red
                        )
                    )
                }
            }

        })
        binding!!.three.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                countVal++
                binding!!.four.requestFocus()
            }

            override fun afterTextChanged(s: Editable?) {
                if (countVal==4) {
                    binding!!.verify.backgroundTintList = ColorStateList.valueOf(
                        ContextCompat.getColor(
                            this@OtpActivity,
                            R.color.btn_red
                        )
                    )
                }
            }

        })

        binding!!.four.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                countVal++
            }

            override fun afterTextChanged(s: Editable?) {
                if (countVal==4) {
                    binding!!.verify.backgroundTintList = ColorStateList.valueOf(
                        ContextCompat.getColor(
                            this@OtpActivity,
                            R.color.btn_red
                        )
                    )
                }
            }

        })



    }
}
