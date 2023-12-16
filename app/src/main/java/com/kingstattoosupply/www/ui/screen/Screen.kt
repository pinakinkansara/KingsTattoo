package com.kingstattoosupply.www.ui.screen

sealed class Screen(val route: String) {
    data object Home : Screen("Home")
    data object Tattoo : Screen("Tattoo")
    data object Cart : Screen("Cart")
}