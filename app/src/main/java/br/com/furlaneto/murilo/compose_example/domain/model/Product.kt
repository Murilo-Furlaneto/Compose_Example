package br.com.furlaneto.murilo.compose_example.domain.model

data class Product(
    val id: Int,
    val name: String,
    val description: String,
    val price: Double,
    val imageUrl: String
)

data class CartItem(
    val product: Product,
    val quantity: Int
)
