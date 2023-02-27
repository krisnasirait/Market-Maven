package com.krisna.marketmaven.data.model


import com.google.gson.annotations.SerializedName

data class ArticleData(
    @SerializedName("articles")
    val articles: List<Article>,
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResults: Int
)