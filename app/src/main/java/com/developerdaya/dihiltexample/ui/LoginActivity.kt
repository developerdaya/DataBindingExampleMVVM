package com.developerdaya.dihiltexample.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.developerdaya.dihiltexample.R
import com.developerdaya.dihiltexample.databinding.ActivityLoginBinding
import com.developerdaya.dihiltexample.viewModel.M1ViewModel

class LoginActivity : AppCompatActivity() {
    private val m1ViewModel: M1ViewModel by viewModels()
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewModel1 = m1ViewModel
        binding.lifecycleOwner = this

        binding.tvSendOtp.setOnClickListener {
            m1ViewModel.hitLogin(
                countryCode = "+91",
                mobileNumber = "7054576474",
                deviceType = 0,
                deviceToken = ""
            )
        }
        observer()
    }

    private fun observer() {
        m1ViewModel.mLogin.observe(this) {
            binding.viewModel1?.apiResponse?.value = it.response.toString()
        }

        m1ViewModel.error.observe(this) {
            binding.viewModel1?.apiResponse?.value = it.message.toString()
        }
    }
}
