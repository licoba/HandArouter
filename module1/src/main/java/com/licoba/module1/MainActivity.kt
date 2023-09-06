package com.licoba.module1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.licoba.ha_annotation.Route

@Route(path = "/module1/module1main")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}