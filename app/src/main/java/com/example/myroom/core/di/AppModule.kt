package com.example.myroom.core.di

import com.example.myroom.core.api.ProductApi
import com.example.myroom.core.constancs.AppConstans
import com.example.myroom.pages.homepage.data.repository.ProductRepository
import com.example.myroom.pages.homepage.data.repository.ProductRepositoryImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun providsProductAp():ProductApi{
        return Retrofit.Builder().baseUrl(AppConstans.BASEURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ProductApi::class.java)
    }
    ///
    @Singleton
    @Provides
    fun providsProductRepository(productApi: ProductApi):ProductRepository{
        return ProductRepositoryImp(productApi)
    }
}