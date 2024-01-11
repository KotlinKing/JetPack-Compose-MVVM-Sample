package com.kotlinking.jetpackcomposemvvmsample.store.data.remote

import com.kotlinking.jetpackcomposemvvmsample.store.domain.model.Product
import retrofit2.http.GET

interface ProductsApi {

    @GET("products")
    suspend fun getProducts(): List<Product>
}