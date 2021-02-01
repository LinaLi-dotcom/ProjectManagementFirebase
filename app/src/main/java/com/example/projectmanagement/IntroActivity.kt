package com.example.projectmanagement

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView


class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        val typeface: Typeface =
            Typeface.createFromAsset(assets, "CarbonBlock.ttf")
        val tv_app_name_intro = findViewById<TextView>(R.id.tv_app_name_intro)
        tv_app_name_intro.typeface= typeface

        val btn_sign_up_intro = findViewById<Button>(R.id.btn_sign_up_intro)
        btn_sign_up_intro.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }

        val btn_sign_in_intro = findViewById<Button>(R.id.btn_sign_in_intro)
        btn_sign_in_intro.setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
        }


    }
}