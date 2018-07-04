package com.android.zore3x.splashpic.model

import com.google.gson.annotations.SerializedName

data class User(
        @SerializedName("id")
        val id: String,
        @SerializedName("updated_at")
        val updatedAt: String,
        @SerializedName("username")
        val username: String,
        @SerializedName("name")
        val name: String,
        @SerializedName("first_name")
        val firstName: String,
        @SerializedName("last_name")
        val lastName: String,
        @SerializedName("instagram_username")
        val instagramUsername: String,
        @SerializedName("twitter_username")
        val twitterUsername: String,
        @SerializedName("portfolio_url")
        val portfolioUrl: String,
        @SerializedName("bio")
        val bio: String,
        @SerializedName("location")
        val location: String,
        @SerializedName("total_likes")
        val totalLikes: Double,
        @SerializedName("total_photos")
        val totalPhotos: Double,
        @SerializedName("total_collections")
        val totalCollections: Double,
        @SerializedName("followed_by_user")
        val followedByUser: Boolean,
        @SerializedName("followers_count")
        val followersCount: Double,
        @SerializedName("following_count")
        val followingCount: Double,
        @SerializedName("downloads")
        val downloads: Double,
        @SerializedName("profile_image")
        val profileImage: ProfileImage,
        @SerializedName("badge")
        val badge: Badge,
        @SerializedName("links")
        val links: Links
)
