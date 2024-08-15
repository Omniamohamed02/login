package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityConstrantBinding
import com.example.myapplication.databinding.ActivityLoginBinding

class LoginActivity {


    class MainActivity : ComponentActivity() {
        @SuppressLint("MissingInflatedId")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)


            val binding: ActivityLoginBinding= DataBindingUtil.setContentView(
                this, R.layout.activity_login
            )

            binding.btlogin.setOnClickListener {


                Toast.makeText(this, "password is wrong", Toast.LENGTH_SHORT).show()

            }

        }
    }
}

