package com.ssd.app.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ssd.app.R

class MainActivity : AppCompatActivity() {

    companion object {
        const val TAG: String = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}