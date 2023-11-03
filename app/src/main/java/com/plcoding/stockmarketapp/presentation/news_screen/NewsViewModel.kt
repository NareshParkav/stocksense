package com.plcoding.stockmarketapp.presentation.news_screen

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.plcoding.stockmarketapp.domain.use_case.GetNewsArticleUseCase
import com.plcoding.stockmarketapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(private val getNewsArticleUseCase: GetNewsArticleUseCase) :
    ViewModel() {

    val articles = mutableStateOf(NewsStateHolder())


    init {
        getNewsArticles()
    }

    fun getNewsArticles(){
        getNewsArticleUseCase().onEach {
            when(it){
                is Resource.Loading->{
                    articles.value = NewsStateHolder(isLoading = true)
                }
                is Resource.Success->{
                    articles.value = NewsStateHolder(data = it.data)
                }
                is Resource.Error->{
                    articles.value = NewsStateHolder(error = it.message.toString())
                }
            }
        }.launchIn(viewModelScope)
    }



}