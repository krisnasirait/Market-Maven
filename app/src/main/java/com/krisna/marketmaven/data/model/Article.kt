package com.krisna.marketmaven.data.model


import com.google.gson.annotations.SerializedName

data class Article(
    @SerializedName("author")
    val author: String,
    @SerializedName("overview")
    val overview: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("publishedAt")
    val publishedAt: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("image")
    val image: Int
)