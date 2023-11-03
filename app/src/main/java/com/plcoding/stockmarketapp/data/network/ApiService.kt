package com.plcoding.stockmarketapp.data.network

import com.plcoding.stockmarketapp.data.model.NewsDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    // https://newsapi.org/v2/top-headlines?country=us&apiKey=436a7b507ee5433bafa1ad67c8eff93b
    //https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=3c4340abc9dc41d58e15560ea8fea69b

    @GET("top-headlines")
    suspend fun getNewsArticles(
        @Query("country") country:String="us",
        @Query("category") category:String="business",
        @Query("apiKey") apiKey:String="3c4340abc9dc41d58e15560ea8fea69b"
    ):Response<NewsDTO>



}