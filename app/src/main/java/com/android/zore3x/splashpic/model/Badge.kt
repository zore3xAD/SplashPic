package com.android.zore3x.splashpic.model

import com.google.gson.annotations.SerializedName

data class Badge(
        @SerializedName("title")
        val title: String,
        @SerializedName("primary")
        val primary: Boolean,
        @SerializedName("slug")
        val slug: String,
        @SerializedName("link")
        val link: String
)