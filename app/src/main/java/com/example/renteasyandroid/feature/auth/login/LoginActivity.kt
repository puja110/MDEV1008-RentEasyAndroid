package com.example.renteasyandroid.feature.auth.login

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.example.renteasyandroid.R
import com.example.renteasyandroid.base.BaseActivity
import com.example.renteasyandroid.databinding.ActivityLoginBinding
import com.example.renteasyandroid.feature.auth.forgotpassword.ForgotPasswordActivity
import com.example.renteasyandroid.feature.auth.register.RegisterActivity
import com.example.renteasyandroid.feature.main.MainActivity

class LoginActivity : BaseActivity<ActivityLoginBinding>() {

    private val viewModel: LoginViewModel by viewModels()

    companion object {
        fun start(activity: Activity) {
            val intent = Intent(activity, LoginActivity::class.java)
            intent.flags =
                Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
            activity.startActivity(intent)
            activity.finish()
        }
    }

    override fun layout() = R.layout.activity_login

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.btnLogin.setOnClickListener {
            MainActivity.start(this)
        }
        binding.btnCreateAccount.setOnClickListener {
            RegisterActivity.start(this)
        }
        binding.tvForgotPassword.setOnClickListener {
            ForgotPasswordActivity.start(this)
        }
    }

    override fun initObservers() {
    }
}