package com.ircarren.agenda2030.models.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import androidx.navigation.navigation
import com.ircarren.agenda2030.models.navigation.routes.AppScreen
import com.ircarren.agenda2030.screens.HomeScreen
import com.ircarren.agenda2030.screens.ProfileScreen
import com.ircarren.agenda2030.screens.SootheNavBar

@Composable
fun NavigationGraph() {
    val navController  = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreen.Home.route){
        composable(route = AppScreen.Home.route){
            HomeScreen(navController = navController)
        }
        composable(route = AppScreen.Profile.route){
            ProfileScreen(navController = navController)
        }
    }
}
