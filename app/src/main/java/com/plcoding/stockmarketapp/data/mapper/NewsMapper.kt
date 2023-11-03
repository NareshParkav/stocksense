package com.plcoding.stockmarketapp.data.mapper

import com.plcoding.stockmarketapp.data.model.ArticleDTO
import com.plcoding.stockmarketapp.domain.model.Article

fun List<ArticleDTO>.toDomain():List<Article>{
    return map{
        Article(
            content = it.content?:"",
            description = it.description?:"",
            title = it.title?:"",
            urlToImage = it.urlToImage?:""
        )
    }
}