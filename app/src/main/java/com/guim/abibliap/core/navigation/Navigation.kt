package com.guim.abibliap.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.guim.abibliap.presentation.folha.FolhaScreen
import com.guim.abibliap.presentation.home.home_screen.HomeScreen

@Composable
fun Navigation(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route
    ) {
        composable(
            route = Screen.HomeScreen.route
        ) {
            HomeScreen(navController)
        }
        composable(
            route = Screen.FolhaScreen.route
        ) {
            FolhaScreen(navController)
        }
    }
}