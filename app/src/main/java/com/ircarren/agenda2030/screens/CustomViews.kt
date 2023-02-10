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

//bodyLarge - titleLarge - labelSmall
@Composable
fun Greeting() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "21, 6 % de la población española vive por debajo del umbral nacional de la pobreza" +
                    " (31% de menores de 16 años; 21,9% de 16 a 64 años y 14,8 mayores de 65 años)",
            style = MaterialTheme.typography.titleLarge
        )

        Spacer(modifier = Modifier.padding(8.dp))

        Text(
            text = "Según el tipo de hogar el % más alto de riesgo de pobreza y/o exclusión social corresponde" +
                    " a un hogar con una persona adulta con 1 o más hijos dependientes (47,9%)\n",
            style = MaterialTheme.typography.bodyLarge
        )

        Spacer(modifier = Modifier.padding(8.dp))

        Text(text = "Los hogares con menores de 18 años sufren un mayor riesgo de exclusión social que el promedio nacional (32%)\n",
            style = MaterialTheme.typography.labelSmall
        )
    }

}



// funcion que genera una barra de busqueda
@Composable
fun SearchBar(modifier: Modifier = Modifier){
    // funcion que crea la barra de busqueda
    Row(modifier = modifier.padding(8.dp)) {
        TextField(
            value = "",
            onValueChange = {

            },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Search, contentDescription = null)
            },
            placeholder = {
                Text(text = "Buscar")
            },
            modifier = Modifier
                .heightIn(min = 56.dp)
                .fillMaxWidth()
        )
    }
}



// funcion que genera la barra de navegacion

@Composable
fun BottomNavigation(modifier: Modifier = Modifier, navController: NavController){

    //var selectedTab by remember { mutableStateOf(0) }
    val items_icons = IconProvider.icons

    Row(
        modifier = modifier,
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Center
    ){
        NavigationBar {
            items_icons.forEachIndexed { index, icono ->
                NavigationBarItem(
                    selected = icono.isSelected,
                    onClick = {
                        IconProvider.icons.forEach { icon ->
                            icon.isSelected = icon.title == icono.title
                        }
                        IconProvider.icons.forEach { icon ->
                            println(icon)
                        }
                        navController.navigate(route = icono.route)
                              },
                    icon = { Icon(imageVector = icono.icon, contentDescription = icono.title) },
                    label = { Text(text = icono.title) }
                )
            }
        }
    }
}

// funcion que genera un SootheNavBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SootheNavBar(navController: NavController){

    Agenda2030Theme {
        Scaffold(bottomBar = {BottomNavigation(navController = navController)}
        ){
                padding ->  HomeScreen(Modifier.padding(padding) )
        }
    }
}
// Funcion que genera una HomeScreen
@Composable
fun HomeScreen(modifier: Modifier = Modifier){
    Surface(color = MaterialTheme.colorScheme.secondary, modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState())) {
            SearchBar()
            Spacer(modifier = Modifier.height(8.dp))
            Spacer(modifier = Modifier.height(8.dp))
            Greeting()
            Spacer(modifier = Modifier.height(8.dp))
            Spacer(modifier = Modifier.height(8.dp))
            Greeting()
            Spacer(modifier = Modifier.height(8.dp))
            Spacer(modifier = Modifier.height(8.dp))
            Greeting()
            Spacer(modifier = Modifier.height(8.dp))
            Spacer(modifier = Modifier.height(8.dp))
            Greeting()
        }
    }
}