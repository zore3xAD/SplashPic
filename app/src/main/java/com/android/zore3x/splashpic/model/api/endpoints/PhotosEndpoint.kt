package com.android.zore3x.splashpic.model.api.endpoints

import com.android.zore3x.splashpic.model.Photo
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface PhotosEndpoint {

    @GET("photos")

    fun getPhotos(@Query("page") page: Int,
                  @Query("per_page") perPage: Int,
                  @Query("order_by") orderBy: String): Observable<MutableList<Photo>>

}