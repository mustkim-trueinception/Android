package com.example.androidpractice.presentation.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androidpractice.presentation.screens.Mainpage
import com.example.androidpractice.presentation.screens.login.Login
import com.example.androidpractice.presentation.screens.signinpage.Signup
import com.example.androidpractice.presentation.screens.welcomepage.Welcome
import kotlinx.serialization.Serializable

// Routes Are Define Here

sealed class Route{
    @Serializable
    data object Welcome: Route()

    @Serializable
    data object Signup: Route()

    @Serializable
    data object Login: Route()

    @Serializable
    data object Home: Route()

}

// Nav Controller Defined Here
@Composable
fun Navigation(){

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Route.Welcome) {
        composable<Route.Welcome> { Welcome(navController) }
        composable<Route.Login> { Login(navController) }
        composable<Route.Signup> { Signup(navController) }
        composable<Route.Home> {  Mainpage()  }

    }
}