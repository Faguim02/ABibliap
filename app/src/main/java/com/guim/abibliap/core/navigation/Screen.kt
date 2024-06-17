package com.guim.abibliap.core.navigation

sealed class Screen(val route: String) {
    object SplashScreen: Screen("splashScreen")
    object HomeScreen: Screen("home")
}