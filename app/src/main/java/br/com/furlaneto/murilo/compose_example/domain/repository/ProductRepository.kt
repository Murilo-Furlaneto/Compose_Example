package br.com.furlaneto.murilo.compose_example.domain.repository

import br.com.furlaneto.murilo.compose_example.domain.model.CartItem
import br.com.furlaneto.murilo.compose_example.domain.model.Product

interface ProductRepository {
    fun getProducts(): List<Product>
    fun getProductById(id: Int): Product?
    fun addProduct(product: Product)
    fun removeProduct(product: Product)
    fun addToCart(product: Product)
    fun fetchAllCartItems(): List<CartItem>
    fun getTotalCartItems(): Double
}
