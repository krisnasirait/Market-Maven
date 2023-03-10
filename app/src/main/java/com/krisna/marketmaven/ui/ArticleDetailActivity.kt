package com.krisna.marketmaven.ui

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.krisna.marketmaven.data.model.Article
import com.krisna.marketmaven.databinding.ActivityArticleDetailBinding

class ArticleDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityArticleDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArticleDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        getAndShowData()
    }

    private fun getAndShowData() {
        val article = intent?.getParcelableExtra<Article>("article")
        val author = "Author : " + article?.author
        val title = article?.title
        val description = article?.description
        val image = article?.image

        Glide.with(this)
            .load(image)
            .into(binding.ivPoster)

        binding.tvMainTitle.text = title
        binding.tvAuthor.text = author
        binding.tvDescription.text = description
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}