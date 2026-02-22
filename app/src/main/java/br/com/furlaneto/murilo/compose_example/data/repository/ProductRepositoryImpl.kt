package br.com.furlaneto.murilo.compose_example.data.repository

import br.com.furlaneto.murilo.compose_example.domain.model.CartItem
import br.com.furlaneto.murilo.compose_example.domain.model.Product
import br.com.furlaneto.murilo.compose_example.domain.repository.ProductRepository
import br.com.furlaneto.murilo.compose_example.mock.addProduct as mockAddProduct
import br.com.furlaneto.murilo.compose_example.mock.addToCart as mockAddToCart
import br.com.furlaneto.murilo.compose_example.mock.fetchAllCartItems as mockFetchAllCartItems
import br.com.furlaneto.murilo.compose_example.mock.getProductById as mockGetProductById
import br.com.furlaneto.murilo.compose_example.mock.getProducts as mockGetProducts
import br.com.furlaneto.murilo.compose_example.mock.getTotalCartItems as mockGetTotalCartItems
import br.com.furlaneto.murilo.compose_example.mock.removeProduct as mockRemoveProduct

class ProductRepositoryImpl : ProductRepository {
    override fun getProducts(): List<Product> = mockGetProducts()

    override fun getProductById(id: Int): Product? = mockGetProductById(id)

    override fun addProduct(product: Product) = mockAddProduct(product)

    override fun removeProduct(product: Product) = mockRemoveProduct(product)

    override fun addToCart(product: Product) = mockAddToCart(product)

    override fun fetchAllCartItems(): List<CartItem> = mockFetchAllCartItems()

    override fun getTotalCartItems(): Double = mockGetTotalCartItems()
}
