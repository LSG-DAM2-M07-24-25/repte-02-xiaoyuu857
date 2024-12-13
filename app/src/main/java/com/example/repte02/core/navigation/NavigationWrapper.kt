package com.example.repte02.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.repte02.ui.views.MenuScreen
import com.example.repte02.ui.views.SplashScreen

@Composable
fun NavigationWrapper() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") {
            SplashScreen {
                navController.popBackStack()
                navController.navigate("menu")
            }
        }
        composable("menu") {
            MenuScreen {
                navController.navigate("menu")
            }
        }
    }
}