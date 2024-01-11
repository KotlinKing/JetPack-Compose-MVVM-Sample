package com.kotlinking.jetpackcomposemvvmsample.store.presentation.products_screen

import com.kotlinking.jetpackcomposemvvmsample.store.domain.model.Product

data class ProductsViewState(
    val isLoading: Boolean = false,
    val products: List<Product> = emptyList(),
    val error: String? = null
)
