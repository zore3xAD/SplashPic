package com.android.zore3x.splashpic

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class PhotoListActivity : AppCompatActivity() {

    companion object {
        fun newInstance(context: Context) = Intent(context, PhotoListActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_list)
    }
}
