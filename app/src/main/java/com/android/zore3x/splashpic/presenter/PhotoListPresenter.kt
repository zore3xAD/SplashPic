package com.android.zore3x.splashpic.presenter

import android.view.View
import com.android.zore3x.splashpic.App
import com.android.zore3x.splashpic.PhotoListActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class PhotoListPresenter {

    var view: PhotoListActivity? = null

    fun attach(view: PhotoListActivity) { this.view = view }
    fun detach() {this.view = null}

    fun loadPhoto() {
        App.unsplash.getPhotos()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ view?.showData(it)},
                        {view?.showMessage("error")})
    }
}