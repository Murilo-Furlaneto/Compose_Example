package br.com.furlaneto.murilo.compose_example.mock

import androidx.compose.runtime.mutableStateListOf
import br.com.furlaneto.murilo.compose_example.domain.model.CartItem
import br.com.furlaneto.murilo.compose_example.domain.model.Product

var productItems = mutableStateListOf<Product>(
    Product(
        id = 1,
        name = "Hambúrguer Gourmet",
        description = "Pão brioche, carne 180g, queijo cheddar e bacon crocante.",
        price = 35.90,
        imageUrl = "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?w=500"
    ),
    Product(
        id = 2,
        name = "Batata Frita Rústica",
        description = "Batatas cortadas à mão com alecrim e páprica defumada.",
        price = 18.00,
        imageUrl = "https://images.unsplash.com/photo-1573015084184-213011612984?w=500"
    ),
    Product(
        id = 3,
        name = "Cebola Empanada",
        description = "Anéis de cebola super crocantes acompanhados de molho barbecue.",
        price = 22.50,
        imageUrl = "https://images.unsplash.com/photo-1639024471283-03518883512d?w=500"
    ),
    Product(
        id = 4,
        name = "Milkshake de Nutella",
        description = "500ml de pura cremosidade com muuuita Nutella original.",
        price = 24.00,
        imageUrl = "https://images.unsplash.com/photo-1563805042-7684c019e1cb?w=500"
    ),
    Product(
        id = 5,
        name = "Refrigerante Lata",
        description = "Coca-cola ou Guaraná Antártica 350ml gelado.",
        price = 6.50,
        imageUrl = "https://images.unsplash.com/photo-1622483767028-3f66f32aef97?w=500"
    ),
    Product(
        id = 6,
        name = "Combo Casal",
        description = "2 Hambúrgueres + 1 Batata Grande + 2 Refrigerantes.",
        price = 85.00,
        imageUrl = "https://images.unsplash.com/photo-1594212699903-ec8a3eca50f5?w=500"
    ),
    Product(
        id = 7,
        name = "Salada Caesar",
        description = "Alface americana, croutons, frango grelhado e molho especial.",
        price = 29.90,
        imageUrl = "https://images.unsplash.com/photo-1550304943-4f24f54ddde9?w=500"
    ),
    Product(
        id = 8,
        name = "Petit Gâteau",
        description = "Bolinho de chocolate recheado com sorvete de baunilha.",
        price = 19.90,
        imageUrl = "https://images.unsplash.com/photo-1624353335566-3d71057da917?w=500"
    )
)

var cartItems = mutableStateListOf<CartItem>()

fun getProducts(): List<Product> = productItems

fun getProductById(id: Int): Product? = productItems.find { it.id == id }

fun addProduct(product: Product) {
    productItems.add(product)
}

fun removeProduct(product: Product) {
    productItems.remove(product)
}

fun getTotalCartItems(): Double {
    return cartItems.sumOf { it.product.price * it.quantity }
}

fun fetchAllCartItems(): List<CartItem> {
    return cartItems
}

fun addToCart(product: Product) {
    val existingIndex = cartItems.indexOfFirst { it.product.id == product.id }

    if (existingIndex != -1) {
        val item = cartItems[existingIndex]
        cartItems[existingIndex] = item.copy(quantity = item.quantity + 1)
    } else {
        cartItems.add(CartItem(product, 1))
    }
}
