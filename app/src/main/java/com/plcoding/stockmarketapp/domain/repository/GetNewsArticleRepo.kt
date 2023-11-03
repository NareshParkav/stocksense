package com.plcoding.stockmarketapp.domain.repository

import com.plcoding.stockmarketapp.domain.model.Article

interface GetNewsArticleRepo {

    suspend fun getNewsArticle():List<Article>

}