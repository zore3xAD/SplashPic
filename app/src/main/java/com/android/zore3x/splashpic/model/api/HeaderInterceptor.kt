package com.android.zore3x.splashpic.model.api

import okhttp3.Interceptor
import okhttp3.Response

class HeaderInterceptor(val clientId: String) : Interceptor{

    override fun intercept(chain: Interceptor.Chain): Response =
            chain.proceed(chain.request().newBuilder()
                    .addHeader("Authorization", "Client-ID $clientId")
                    .build())
}