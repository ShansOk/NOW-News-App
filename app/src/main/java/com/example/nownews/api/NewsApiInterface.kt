package com.example.nownews.api

import com.example.nownews.data.Article
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiInterface {
    @GET("/v2/everything")

    suspend fun getData(
        @Query("apiKey")
        apiKey: String = API_KEY,
        @Query("country")
        country: String = "us",
        @Query("q")
        topic: String = "beyoncé"
    ) : Response<List<Article>>

    companion object {
        private const val API_KEY = "ad2e0ccc3b414df1961390518b8e3095"
    }

}