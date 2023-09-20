package com.example.healthsns

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class MainBoardActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_board)

        val viewPager = findViewById<ViewPager2>(R.id.main_board_page_container)
        val adapter = ViewPageAdapter(this)
        viewPager.adapter = adapter
    }
}