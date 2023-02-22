package com.example.myroom.pages.homepage.data.repository

import com.example.myroom.core.recourc.Recourc
import com.example.myroom.pages.homepage.data.model.StoreModel
import kotlinx.coroutines.flow.Flow

interface ProductRepository {
    suspend fun getProducts(): Flow<Recourc<StoreModel>>
}