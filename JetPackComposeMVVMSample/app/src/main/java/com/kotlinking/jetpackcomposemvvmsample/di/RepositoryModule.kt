package com.kotlinking.jetpackcomposemvvmsample.di

import com.kotlinking.jetpackcomposemvvmsample.store.data.repository.ProductsRepositoryImpl
import com.kotlinking.jetpackcomposemvvmsample.store.domain.repository.ProductsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindProductsRepository(imp: ProductsRepositoryImpl): ProductsRepository
}