package com.krisna.marketmaven.ui

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.recyclerview.widget.LinearLayoutManager
import com.krisna.marketmaven.R
import com.krisna.marketmaven.adapter.ArticleAdapter
import com.krisna.marketmaven.data.DataArticle
import com.krisna.marketmaven.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), ArticleAdapter.OnItemClickListener {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterArticle: ArticleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize the splash screen.
        installSplashScreen()

        // Inflate the layout and set it as the content view.
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up the RecyclerView.
        adapterArticle = ArticleAdapter(this)
        adapterArticle.setDataArticle(DataArticle.itemArticle)
        binding.rvArticle.apply {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = adapterArticle
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Inflate the menu.
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle menu item clicks.
        return when (item.itemId) {
            R.id.action_about -> {
                startActivity(Intent(this, AboutActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onItemClick(article: Parcelable) {
        // Start the ArticleDetailActivity and pass in the article as an extra.
        val intent = Intent(this, ArticleDetailActivity::class.java).apply {
            putExtra("article", article)
        }
        startActivity(intent)
    }
}