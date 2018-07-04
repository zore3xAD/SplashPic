package com.android.zore3x.splashpic.model

import com.google.gson.annotations.SerializedName

data class Photo(
        @SerializedName("id")
        var id: String,
        @SerializedName("created_at")
        var createdAt: String,
        @SerializedName("updated_at")
        var updatedAt: String,
        @SerializedName("wight")
        var wight: Long,
        @SerializedName("height")
        var height: Long,
        @SerializedName("color")
        var color: String,
        @SerializedName("downloads")
        var downloads: Long,
        @SerializedName("likes")
        var likes: Long,
        @SerializedName("liked_by_user")
        var likesByUser: Boolean,
        @SerializedName("description")
        var description: String
)
