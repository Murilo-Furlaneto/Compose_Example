package br.com.furlaneto.murilo.compose_example.presentation.home

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import br.com.furlaneto.murilo.compose_example.data.repository.ProductRepositoryImpl
import br.com.furlaneto.murilo.compose_example.domain.model.Product
import br.com.furlaneto.murilo.compose_example.domain.repository.ProductRepository
import br.com.furlaneto.murilo.compose_example.domain.usecase.GetProductsUseCase

class HomeViewModel : ViewModel() {
    private val repository: ProductRepository = ProductRepositoryImpl()
    
    private val getProductsUseCase = GetProductsUseCase(repository)

    private val _products = mutableStateListOf<Product>()
    val products: List<Product> = _products

    init {
        loadProducts()
    }

    private fun loadProducts() {
        _products.clear()
        _products.addAll(getProductsUseCase.execute())
    }
}
