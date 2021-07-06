package com.precious.recycleraccessmentactivity

import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.precious.recycleraccessmentactivity.databinding.ActivityItemDetailsBinding


class ItemDetailsActivity : AppCompatActivity() {
    private lateinit var binding :ActivityItemDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityItemDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val str = intent.getStringExtra("PositionID")
//        text.setText(str)
        binding.detailFirstName.setText(str)
    }
}