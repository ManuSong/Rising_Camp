package com.risingcamp.manu.layoutactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MypageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mypage)

        findViewById<ImageView>(R.id.back_page).apply {
            this.setOnClickListener {
                startActivity(
                    Intent(this@MypageActivity, MainPageActivity::class.java)
                )
            }
        }
    }
}