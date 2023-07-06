package com.example.cinematickets.ui.booking_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.cinematickets.R

@Composable
fun BackgroundForBookingScreen() {
    Image(
        painter = painterResource(id = R.drawable.imagesblack),
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize(),
        contentScale = ContentScale.FillBounds,
    )
}