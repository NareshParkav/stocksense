package com.plcoding.stockmarketapp.presentation.news_screen

import com.plcoding.stockmarketapp.domain.model.Article

data class NewsStateHolder(
    val isLoading:Boolean=false,
    val data:List<Article>?=null,
    val error:String=""

)