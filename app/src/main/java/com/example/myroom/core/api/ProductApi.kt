package com.example.myroom.core.api

import com.example.myroom.core.constancs.AppConstans
import com.example.myroom.pages.homepage.data.model.StoreModel
import retrofit2.Response
import retrofit2.http.GET

interface ProductApi {
    @GET(AppConstans.ENDPOINTPRODACTS)
    suspend fun getProducts():Response<StoreModel>
}