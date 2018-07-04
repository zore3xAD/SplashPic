package com.android.zore3x.splashpic

import android.app.Application
import com.android.zore3x.splashpic.model.api.Unsplash

class App : Application() {

    val CLIENT_ID = "3d27c12a5c0f8f2003ed071bbed8aa1e716d2fa8693c2c04e84c836047e234c9"
    companion object {
        lateinit var unsplash: Unsplash
            private set
            get
    }
    override fun onCreate() {
        super.onCreate()
        unsplash = Unsplash(CLIENT_ID)
    }

}