package com.example.celebrities

import android.app.Activity
import android.os.Bundle
import android.view.WindowManager
import com.example.celebrities.MainActivity.Companion.EXTRA_IMAGEM_CELEBRIDADE
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val foto = intent.extras?.getInt(EXTRA_IMAGEM_CELEBRIDADE)
        //Intent extra

        foto?.let {//Se a foto n for nula
            imageView2.setImageResource(it)
        }

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
    }


}