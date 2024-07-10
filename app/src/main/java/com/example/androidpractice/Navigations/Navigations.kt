package com.example.androidpractice.Navigations

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androidpractice.Screens.Login
import com.example.androidpractice.Screens.Signup
import com.example.androidpractice.Screens.Welcome
import kotlinx.serialization.Serializable

// Routes Are Defiene Here

sealed class Route{
    @Serializable
    object Welcome: Route()

    @Serializable
    object Signup: Route()

    @Serializable
    object Login: Route()

}

// Nav Controller Defined Here
@Composable
fun navigation(){

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Route.Welcome) {
        composable<Route.Welcome> { Welcome(navController) }
        composable<Route.Login> { Login(navController) }
        composable<Route.Signup> { Signup(navController) }

    }
}