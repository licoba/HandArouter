package com.licoba.handarouter

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.licoba.ha_annotation.Route
import com.licoba.handarouter.databinding.ActivityMainBinding

@Route(path = "/app/main")
class MainActivity : AppCompatActivity() {

    private lateinit var mBinding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("App主页起来了")
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        mBinding.initListener()
    }

    private fun ActivityMainBinding.initListener(){
        mBinding.btn1.setOnClickListener { startModule1MainActivity() }
    }


    fun startModule1MainActivity() {
//        EasyRouter.getsInstance().build("/module1/module1main").navigation();

    }

}