package com.example.genericex

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.genericex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        //navigate=context(SecondAct::class.java)

        binding.btnClick.setOnClickListener {
            Navigate.navigateToNextPage(
                this, SecondAct::class.java
            )
        }

    }
}


private fun Any.context(java: Class<SecondAct>): Navigate {
    return context(SecondAct::class.java)
}

