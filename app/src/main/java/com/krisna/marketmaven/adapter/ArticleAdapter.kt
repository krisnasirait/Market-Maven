package com.krisna.marketmaven.adapter

import android.annotation.SuppressLint
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.krisna.marketmaven.data.model.Article
import com.krisna.marketmaven.databinding.ItemArticleBinding

class ArticleAdapter(
    private val itemClickListener: OnItemClickListener
): RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder> () {

    private val itemArticle = mutableListOf<Article?>()

    inner class ArticleViewHolder(private val binding: ItemArticleBinding) :
    RecyclerView.ViewHolder(binding.root){
        fun bind(item: Article) {
            binding.tvTitle.text = item.title
            binding.tvPublishDate.text = item.publishedAt
            binding.tvOverview.text = item.overview
            Glide.with(binding.root)
                .load(item.image)
                .into(binding.ivPoster)
            binding.root.setOnClickListener {
                itemClickListener.onItemClick(item)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        return ArticleViewHolder(ItemArticleBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ))
    }

    override fun getItemCount(): Int {
        return itemArticle.size
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        itemArticle[position]?.let { holder.bind(it) }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setDataArticle(article: List<Article?>) {
        itemArticle.clear()
        itemArticle.addAll(article)
        notifyDataSetChanged()
    }


    interface OnItemClickListener {
        fun onItemClick(article: Parcelable)
    }
}