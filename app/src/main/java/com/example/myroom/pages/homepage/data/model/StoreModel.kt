package com.example.myroom.pages.homepage.data.model


import com.google.gson.annotations.SerializedName

data class StoreModel(
    @SerializedName("limit")
    val limit: Int,
    @SerializedName("products")
    val products: List<Product>,
    @SerializedName("skip")
    val skip: Int,
    @SerializedName("total")
    val total: Int
)