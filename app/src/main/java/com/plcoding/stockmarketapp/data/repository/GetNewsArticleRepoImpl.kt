package com.plcoding.stockmarketapp.data.repository

import com.plcoding.stockmarketapp.data.mapper.toDomain
import com.plcoding.stockmarketapp.data.network.ApiService
import com.plcoding.stockmarketapp.domain.model.Article
import com.plcoding.stockmarketapp.domain.repository.GetNewsArticleRepo
import com.plcoding.stockmarketapp.util.SafeApiRequest
import javax.inject.Inject

class GetNewsArticleRepoImpl @Inject constructor(private val apiService: ApiService) :
    GetNewsArticleRepo , SafeApiRequest(){
    override suspend fun getNewsArticle(): List<Article> {
        val response = safeApiRequest { apiService.getNewsArticles() }
        return response?.articles?.toDomain()!!
    }
}