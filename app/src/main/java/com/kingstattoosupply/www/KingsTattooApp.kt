package com.kingstattoosupply.www

import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavInflater
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.kingstattoosupply.www.model.NavigationItem
import com.kingstattoosupply.www.ui.screen.Screen


@Composable
fun KingsTattooApp(
) {
    val navController = rememberNavController()
    val navBackStack by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStack?.destination
    Scaffold(
        topBar = { KingsTopAppBar(currentDestination?.route) },
        content = { padding ->
            KingsTattooNavHost(
                Modifier
                    .statusBarsPadding()
                    .navigationBarsPadding()
                    .padding(padding),
                navController = navController
            )
        },
        bottomBar = {
            BottomNavBar(navController = navController, currentDestination)
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun KingsTopAppBar(title: String?) {
    CenterAlignedTopAppBar(modifier = Modifier.shadow(elevation = 2.dp),title = { Text(text = title ?: "") })
}

@Composable
private fun BottomNavBar(navController: NavController, currentDestination: NavDestination?) {
    val items = listOf(NavigationItem.Home, NavigationItem.Tattoo, NavigationItem.Cart)

    NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = currentDestination?.hierarchy?.any { it.route == item.title } == true,
                onClick = {
                    navController.navigate(item.title) {
                        // Pop up to the start destination of the graph to
                        // avoid building up a large stack of destinations
                        // on the back stack as users select items
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        // Avoid multiple copies of the same destination when
                        // reselecting the same item
                        launchSingleTop = true
                        // Restore state when reselecting a previously selected item
                        restoreState = true
                    }
                },
                label = { Text(text = item.title) },
                icon = { Icon(item.icon, contentDescription = null) })
        }
    }
}

