package com.android.zore3x.splashpic.view

import com.android.zore3x.splashpic.model.Photo

interface PhotoListView {

    fun showData(data: MutableList<Photo>)
    fun showMessage(message: String)


}