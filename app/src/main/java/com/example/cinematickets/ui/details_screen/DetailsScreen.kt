package com.example.cinematickets.ui.details_screen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.cinematickets.Screen
import com.example.cinematickets.viewModel_screens.DetailsViewModel

@SuppressLint("NewApi")
@Composable
fun DetailsScreen(
    navController: NavController,
    viewModel: DetailsViewModel = hiltViewModel()
) {
    DetailsScreenContent(
        onClickBooking = { navController.navigate(Screen.BookingScreen.route) },
        onClickBack = { navController.navigateUp() }
    )
}

@Composable
fun DetailsScreenContent(onClickBooking: () -> Unit, onClickBack: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize(), contentAlignment = Alignment.TopCenter
    ) {

        BackgroundForDetailsScreen()
        IconForPlayButton()
        TextTimeScreen(Color.White) { onClickBack() }
    }
    Box(
        modifier = Modifier
            .offset(x = 0.dp, y = 400.dp)
            .fillMaxWidth()
            .height(500.dp)
            .background(
                color = Color(0xFFFFFFFF),
                shape = RoundedCornerShape(
                    topStart = 32.dp,
                    topEnd = 32.dp,
                    bottomEnd = 0.dp,
                    bottomStart = 0.dp
                )
            ), contentAlignment = Alignment.BottomCenter
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            RowForEvaluationForDetailsScreen()
            MovieTitleForDetailsScreen()
            RowForChips()
            LazyRowForImagePerson()
            TextForDescription()
            ButtonForBooking { onClickBooking() }

        }


    }
}










