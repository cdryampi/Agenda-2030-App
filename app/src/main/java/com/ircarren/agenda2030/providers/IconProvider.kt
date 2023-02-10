package com.ircarren.agenda2030.providers

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import com.ircarren.agenda2030.models.Icono
import com.ircarren.agenda2030.models.navigation.routes.AppScreen

class IconProvider {

    companion object {
        var icons = listOf<Icono>(
            Icono(Icons.Filled.Home, "Home", AppScreen.Home.route, true),
            Icono(Icons.Filled.Favorite, "Favoritos", AppScreen.Home.route, false),
            Icono(Icons.Default.Add, "add", AppScreen.Home.route, false),
            Icono(Icons.Default.AccountBox, "profile", AppScreen.Profile.route, false),
        )

    }
}