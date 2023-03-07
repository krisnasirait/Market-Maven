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

        intent?.getParcelableExtra<Article>("article")?.apply {
            binding.tvMainTitle.text = title
            binding.tvAuthor.text = "Author : $author"
            binding.tvDescription.text = description
            Glide.with(this@ArticleDetailActivity).load(image).into(binding.ivPoster)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}