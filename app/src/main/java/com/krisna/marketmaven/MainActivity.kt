package com.krisna.marketmaven

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.krisna.marketmaven.adapter.ArticleAdapter
import com.krisna.marketmaven.data.DataArticle
import com.krisna.marketmaven.data.model.Article
import com.krisna.marketmaven.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), ArticleAdapter.OnItemClickListener {

    private lateinit var rv: RecyclerView
    private lateinit var adapterArticle: ArticleAdapter

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        installSplashScreen()

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        rv = binding.rvArticle
        rv.layoutManager = LinearLayoutManager(this)
        rv.setHasFixedSize(true)

        adapterArticle = ArticleAdapter(this)
        adapterArticle.setDataArticle(DataArticle.itemArticle)
        rv.adapter = adapterArticle

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_about -> {
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onItemClick(article: Article) {
        Intent(this, ArticleDetailActivity::class.java).apply {
            putExtra("author", article.author)
            putExtra("title", article.title)
            putExtra("overview", article.overview)
            putExtra("description", article.description)
            putExtra("publishedAt", article.publishedAt)
            putExtra("image", article.image)
            startActivity(this)
        }
    }
}