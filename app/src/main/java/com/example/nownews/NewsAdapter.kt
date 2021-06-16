package com.example.nownews

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nownews.data.Article
import com.example.nownews.databinding.ArticleItemBinding

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.ArticleViewHolder>() {

    inner class ArticleViewHolder(val binding: ArticleItemBinding): RecyclerView.ViewHolder(binding.root)

    private lateinit var articles: List<Article>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        return ArticleViewHolder(ArticleItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ))
    }
//itemView.xml file needs to be inflated into a view that can be accessed by the kotlin file
//need to to return a TodoViewHolder because the function returns a viewholder that contains the view that has just been created

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        holder.binding.apply {
            val article = articles[position]
            textView.text = article.title
        }
    }
    //itemView is the view that contains all the single views in the xml file (e.g. the textview and checkbox) for each item in the recyclerview

    override fun getItemCount(): Int {
        return articles.size
    }

}