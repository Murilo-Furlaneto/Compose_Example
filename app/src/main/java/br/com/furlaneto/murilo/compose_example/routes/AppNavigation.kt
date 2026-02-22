package br.com.furlaneto.murilo.compose_example.routes

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import br.com.furlaneto.murilo.compose_example.mock.getProductById
import br.com.furlaneto.murilo.compose_example.pages.HomePage
import br.com.furlaneto.murilo.compose_example.pages.LoginPage
import br.com.furlaneto.murilo.compose_example.pages.ProductDetailsPage

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
            val product = productId?.let { getProductById(it) }
            
            if (product != null) {
                ProductDetailsPage(
                    product = product,
                    onBackClick = { navController.popBackStack() }
                )
            }
        }
    }
}
