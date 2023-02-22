package com.example.myroom.pages.homepage.data.repository

import com.example.myroom.core.api.ProductApi
import com.example.myroom.core.constancs.AppConstans.BASEURL
import com.example.myroom.core.recourc.Recourc
import com.example.myroom.pages.homepage.data.model.StoreModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

class ProductRepositoryImp @Inject constructor(
    private  val productServer:ProductApi
    ):ProductRepository {

    override suspend fun getProducts(): Flow<Recourc<StoreModel>> {

        return flow {
            val respons= productServer.getProducts()
            if(respons.isSuccessful){
                emit(Recourc.Success(data = respons.body()!!))
            }
        }
    }
}