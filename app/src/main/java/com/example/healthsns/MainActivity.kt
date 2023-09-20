package com.example.healthsns

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import android.view.animation.AlphaAnimation

class MainActivity : AppCompatActivity() {
    val SPLASH_DELAY: Long = 400
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({ // hadler사용하여 지정한 시간 후 액티비티 전환
            val intent = Intent(this, MainBoardActivity::class.java)
            startActivity(intent)
            finish() // 현재 액티비티 종료
        }, SPLASH_DELAY)
    }
}