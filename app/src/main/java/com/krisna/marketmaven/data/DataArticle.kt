package com.krisna.marketmaven.data

import com.krisna.marketmaven.R
import com.krisna.marketmaven.data.model.Article

object DataArticle {
    val itemArticle : ArrayList<Article> = arrayListOf (
        Article(
            "John Smith",
            "Stocks surge as earnings reports beat expectations",
            "Stocks jumped to record highs as a string of strong earnings reports from major companies exceeded Wall Street's expectations. The Dow Jones Industrial Average rose 500 points, or 1.5%, while the S&P 500 and Nasdaq Composite also gained 1.5%.",
            "2022-02-25T18:00:00Z",
            "Earnings reports beat expectations",
            R.drawable.article1
        ),
        Article(
            "Jane Doe",
            "Oil prices continue to climb amid supply concerns",
            "Oil prices rose to a fresh 7-year high as supply concerns persisted due to ongoing tensions in the Middle East and Russia's recent decision to cut oil exports. Brent crude, the international benchmark, climbed 2% to $90.50 per barrel.",
            "2022-02-25T17:30:00Z",
            "Oil prices climb amid supply concerns",
            R.drawable.article1
        ),
        Article(
            "David Johnson",
            "Retail sales fall as consumers cut back on spending",
            "US retail sales fell 0.5% in January as consumers cut back on spending, according to the Commerce Department. The drop was larger than expected and was the biggest decline since the start of the pandemic.",
            "2022-02-25T17:00:00Z",
            "Retail sales fall in January",
            R.drawable.article1
        ),
        Article(
            "Emily Davis",
            "GameStop stock surges on earnings beat",
            "GameStop shares surged 25% after the company reported better-than-expected earnings for the fourth quarter. The video game retailer also announced plans to expand into online gaming and non-fungible tokens (NFTs).",
            "2022-02-24T16:00:00Z",
            "GameStop stock surges on earnings beat",
            R.drawable.article1
        ),
        Article(
            "James Lee",
            "Bitcoin hits new all-time high above $60,000",
            "Bitcoin reached a new all-time high of $60,450 as the world's largest cryptocurrency continued its upward trajectory. The surge was driven by increased adoption by institutional investors and positive sentiment around the technology.",
            "2022-02-24T15:30:00Z",
            "Bitcoin hits new all-time high",
            R.drawable.article1
        ),
            )
}