package com.krisna.marketmaven.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.krisna.marketmaven.databinding.ActivityArticleDetailBinding

class ArticleDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityArticleDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArticleDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getAndShowData()
    }

    fun getAndShowData() {
        val bundle = intent.extras
        val author = bundle?.getString("author")
        val title = bundle?.getString("title")
        val description = bundle?.getString("description")
        val image = bundle?.getInt("image")

        Glide.with(this)
            .load(image)
            .into(binding.ivPoster)

        binding.tvMainTitle.text = title
        binding.tvAuthor.text = author
        binding.tvDescription.text = description
    }
}