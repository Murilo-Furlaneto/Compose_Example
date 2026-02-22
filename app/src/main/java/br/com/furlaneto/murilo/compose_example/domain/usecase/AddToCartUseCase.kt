package br.com.furlaneto.murilo.compose_example.domain.usecase

import br.com.furlaneto.murilo.compose_example.domain.model.Product
import br.com.furlaneto.murilo.compose_example.domain.repository.ProductRepository

class AddToCartUseCase(private val repository: ProductRepository) {
    fun execute(product: Product) {
        repository.addToCart(product)
    }
}
