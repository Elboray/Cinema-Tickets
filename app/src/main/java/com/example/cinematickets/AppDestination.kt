package com.example.cinematickets


sealed class Screen(val route: String) {
    object HomeScreen : Screen("homeScreen")
    object DetailsScreen : Screen("detailsScreen")
    object BookingScreen : Screen("bookingScreen")
}