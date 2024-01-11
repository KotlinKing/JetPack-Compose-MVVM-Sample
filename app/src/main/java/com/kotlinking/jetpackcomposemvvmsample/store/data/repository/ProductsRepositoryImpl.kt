package com.kotlinking.jetpackcomposemvvmsample.store.data.repository

import arrow.core.Either
import com.kotlinking.jetpackcomposemvvmsample.store.data.mapper.toNetworkError
import com.kotlinking.jetpackcomposemvvmsample.store.data.remote.ProductsApi
import com.kotlinking.jetpackcomposemvvmsample.store.domain.model.NetworkError
import com.kotlinking.jetpackcomposemvvmsample.store.domain.model.Product
import com.kotlinking.jetpackcomposemvvmsample.store.domain.repository.ProductsRepository
import javax.inject.Inject

class ProductsRepositoryImpl @Inject constructor(
    private val productApi: ProductsApi
) : ProductsRepository {

    override suspend fun getProducts(): Either<NetworkError, List<Product>> {
        return Either.catch {
            productApi.getProducts()
        }.mapLeft { it.toNetworkError() }
    }

}