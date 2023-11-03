package com.plcoding.stockmarketapp.domain.di

import com.plcoding.stockmarketapp.data.network.ApiService
import com.plcoding.stockmarketapp.data.repository.GetNewsArticleRepoImpl
import com.plcoding.stockmarketapp.domain.repository.GetNewsArticleRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DomainModule {


    @Provides
    fun provideGetNewsRepo(apiService: ApiService): GetNewsArticleRepo {
        return GetNewsArticleRepoImpl(apiService = apiService)
    }



}