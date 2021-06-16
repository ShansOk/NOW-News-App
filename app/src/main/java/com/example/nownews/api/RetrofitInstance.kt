package com.example.nownews.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val api: NewsApiInterface by lazy {
        Retrofit.Builder()
            .baseUrl("https//www.newsapi.org")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NewsApiInterface::class.java)
    }
}
//Instance will only be created once a request to the api has been made and "by lazy" means it won't keep on creating a new one for subsequent requests