package br.com.furlaneto.murilo.compose_example.domain.usecase

import br.com.furlaneto.murilo.compose_example.domain.model.Product
import br.com.furlaneto.murilo.compose_example.domain.repository.ProductRepository

class GetProductsUseCase(private val repository: ProductRepository) {
    fun execute(): List<Product> {
        return repository.getProducts()
    }
}
