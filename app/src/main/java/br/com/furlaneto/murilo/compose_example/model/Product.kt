package br.com.furlaneto.murilo.compose_example.model

class Product(
    val id: Int,
    val name: String,
    val description: String,
    val price: Double,
    val imageUrl: String
)

class CartItem(
    val product: Product,
    val quantity: Int
) {
}