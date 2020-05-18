package com.nasrin.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.app.ActivityOptionsCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image_view1.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, image_view1 as View, "image")
            startActivity(intent, options.toBundle())
        }
    }
}
