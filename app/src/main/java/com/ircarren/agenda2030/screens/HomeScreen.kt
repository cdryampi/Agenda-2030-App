package com.ircarren.agenda2030.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ircarren.agenda2030.providers.IconProvider
import com.ircarren.agenda2030.ui.theme.Agenda2030Theme

@Composable
fun HomeScreen( modifier: Modifier = Modifier, navController: NavController) {
    SootheNavBar(navController = navController)
}


