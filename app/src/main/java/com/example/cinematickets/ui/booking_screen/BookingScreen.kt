package com.example.cinematickets.ui.booking_screen

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.cinematickets.viewModel_screens.BookingViewModel

@Composable
fun BookingScreen(
    navController: NavController,
    viewModel: BookingViewModel = hiltViewModel()
) {
    BookingScreenContent(
        onClickBack = { navController.navigateUp() }
    )
}

@Composable
fun BookingScreenContent(onClickBack: () -> Unit) {
    BackgroundForBookingScreen()
    ImageFilmForBookingScreen()
    ImageFullSeatForBackground()
    RowStatuesSeat()
    BottomSheetForBookingScreen()
    IconCloseCircle {
        onClickBack()
    }
}
