package com.example.cinematickets.ui.home_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.cinematickets.Screen
import com.example.cinematickets.viewModel_screens.HomeViewModel

@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HomeViewModel = hiltViewModel()
) {
    HomeScreenContent(
        onClickCard = { navController.navigate(Screen.DetailsScreen.route) }
    )
}

@Composable
fun HomeScreenContent(onClickCard: () -> Unit) {
    BackgroundForHomeScreen()
    Box(contentAlignment = Alignment.Center) {
        Column(
            Modifier.padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.Center,
            Alignment.CenterHorizontally
        ) {
            RowChips()
            HorizontalPagerSimple { onClickCard() }
            TextTimeScreen(Color.Black)
            RowBasicChips()
            BottomAppBarCompose()
        }

    }
}