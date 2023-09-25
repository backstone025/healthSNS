package com.example.healthsns

import ViewPageAdapter
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class MainBoardActivity : AppCompatActivity() {

    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button
    private lateinit var btn5: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_board)

        btn1 = findViewById(R.id.main_board_finish)
        btn2 = findViewById(R.id.main_board_settings)
        btn3 = findViewById(R.id.main_board_bottom_btn1)
        btn4 = findViewById(R.id.main_board_bottom_btn2)
        btn5 = findViewById(R.id.main_board_bottom_btn3)

        val viewPager = findViewById<ViewPager2>(R.id.main_board_page_container)
        val adapter = ViewPageAdapter(this)
        viewPager.adapter = adapter
        viewPager.currentItem = 1

        btn2.setOnClickListener {

        }

        btn3.setOnClickListener {
            viewPager.currentItem = 0
        }

        btn4.setOnClickListener {
            viewPager.currentItem = 1
        }

        btn5.setOnClickListener {
            viewPager.currentItem = 2
        }
    }


}
