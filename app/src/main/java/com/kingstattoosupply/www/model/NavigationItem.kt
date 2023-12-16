package com.kingstattoosupply.www.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector
import com.kingstattoosupply.www.ui.screen.Screen

sealed class NavigationItem(val title: String, val icon: ImageVector){
    data object Home : NavigationItem(Screen.Home.route, icon = Icons.Filled.Home)
    data object Tattoo : NavigationItem(Screen.Tattoo.route, icon = Icons.Filled.Favorite)
    data object Cart : NavigationItem(Screen.Cart.route, icon = Icons.Filled.ShoppingCart)
}