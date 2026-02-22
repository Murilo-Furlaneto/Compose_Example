package br.com.furlaneto.murilo.compose_example.routes

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import br.com.furlaneto.murilo.compose_example.mock.getProductById
import br.com.furlaneto.murilo.compose_example.presentation.details.ProductDetailsPage
import br.com.furlaneto.murilo.compose_example.presentation.home.HomePage
import br.com.furlaneto.murilo.compose_example.presentation.login.LoginPage

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginPage(onLoginSucess = {
                navController.navigate("home") {
                    popUpTo("login") { inclusive = true }
                }
            })
        }
        
        composable("home") {
            HomePage(navController = navController)
        }
        
        composable(
            route = "productDetails/{productId}",
            arguments = listOf(navArgument("productId") { type = NavType.IntType })
        ) { backStackEntry ->
            val productId = backStackEntry.arguments?.getInt("productId")
            // Aqui estamos buscando o produto para passar para a tela de detalhes.
            // Em uma arquitetura mais avançada, o ViewModel da Details buscaria pelo ID.
            val product = productId?.let { getProductById(it) }
            
            if (product != null) {
                // Convertendo para o modelo de domínio para compatibilidade com a nova tela
                val domainProduct = br.com.furlaneto.murilo.compose_example.domain.model.Product(
                    id = product.id,
                    name = product.name,
                    description = product.description,
                    price = product.price,
                    imageUrl = product.imageUrl
                )
                
                ProductDetailsPage(
                    product = domainProduct,
                    onBackClick = { navController.popBackStack() }
                )
            }
        }
    }
}
