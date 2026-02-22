package br.com.furlaneto.murilo.compose_example.routes

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.furlaneto.murilo.compose_example.pages.HomePage
import br.com.furlaneto.murilo.compose_example.pages.LoginPage

@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login"){
        composable("login"){
            LoginPage({ navController.navigate("home"){
                popUpTo("login") { inclusive = true }
            } })
        }
        composable("home"){
            HomePage()
        }

    }

}