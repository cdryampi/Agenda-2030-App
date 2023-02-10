package com.ircarren.agenda2030.models.navigation.routes

sealed class AppScreen(
    val route: String
)
{
    object SignIn : AppScreen("signIn")
    object SignUp : AppScreen("signUp")
    object Home : AppScreen("home")
    object Profile : AppScreen("profile")
    object Agenda : AppScreen("agenda")
}
