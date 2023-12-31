package com.example.cinematickets.ui

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cinematickets.Screen
import com.example.cinematickets.ui.booking_screen.BookingScreen
import com.example.cinematickets.ui.details_screen.DetailsScreen
import com.example.cinematickets.ui.home_screen.HomeScreen
import com.example.cinematickets.ui.theme.CinemaTicketsTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationView() {
    CinemaTicketsTheme {

        Scaffold {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
                composable(Screen.HomeScreen.route) {
                    HomeScreen(navController)
                }
                composable(Screen.DetailsScreen.route) {
                    DetailsScreen(navController)
                }
                composable(Screen.BookingScreen.route) {
                    BookingScreen(navController)
                }
            }
        }
    }
}