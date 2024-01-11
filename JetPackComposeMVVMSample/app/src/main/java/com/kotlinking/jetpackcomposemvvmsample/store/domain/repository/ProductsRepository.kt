package com.kotlinking.jetpackcomposemvvmsample.store.domain.repository

import arrow.core.Either
import com.kotlinking.jetpackcomposemvvmsample.store.domain.model.NetworkError
import com.kotlinking.jetpackcomposemvvmsample.store.domain.model.Product

interface ProductsRepository {

    suspend fun getProducts(): Either<NetworkError, List<Product>>

}