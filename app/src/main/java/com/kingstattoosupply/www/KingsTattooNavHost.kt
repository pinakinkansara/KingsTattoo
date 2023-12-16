package com.kingstattoosupply.www

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.kingstattoosupply.www.ui.screen.Screen
import com.kingstattoosupply.www.ui.screen.cart.CartScreen
import com.kingstattoosupply.www.ui.screen.home.HomeScreen
import com.kingstattoosupply.www.ui.screen.tattoo.TattooScreen

@Composable
fun KingsTattooNavHost(modifier: Modifier, navController: NavHostController) {

    NavHost(modifier = modifier, navController = navController, startDestination = "homeGraph") {
        homeGraph(modifier, navController)
        tattooGraph(modifier, navController)
        cartGraph(modifier, navController)
    }
}

private fun NavGraphBuilder.homeGraph(modifier: Modifier, navController: NavController) {
    navigation(startDestination = Screen.Home.route, route = "homeGraph") {
        composable(route = Screen.Home.route) {
            HomeScreen(modifier)
        }
    }
}

private fun NavGraphBuilder.tattooGraph(modifier: Modifier, navController: NavController) {
    navigation(startDestination = Screen.Tattoo.route, route = "tattooGraph") {
        composable(route = Screen.Tattoo.route) {
            TattooScreen(modifier = modifier)
        }
    }
}

private fun NavGraphBuilder.cartGraph(modifier: Modifier, navController: NavController) {
    navigation(startDestination = Screen.Cart.route, route = "cartGraph") {
        composable(route = Screen.Cart.route) {
            CartScreen(modifier = modifier)
        }
    }
}