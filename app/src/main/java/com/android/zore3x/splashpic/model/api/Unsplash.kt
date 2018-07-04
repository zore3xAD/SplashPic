package com.android.zore3x.splashpic.model.api

import com.android.zore3x.splashpic.model.api.endpoints.PhotosEndpoint
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class Unsplash(val clientId: String) {

    val BASE_URL = "https://api.unsplash.com/"

    val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .client(OkHttpClient.Builder().addInterceptor(HeaderInterceptor(clientId)).build())
            .build()

    private val photosService = retrofit.create(PhotosEndpoint::class.java)

    fun getPhotos(page: Int = 1, perPage: Int = 10, orderBy: String = "latest") =
            photosService.getPhotos(page, perPage, orderBy)
}