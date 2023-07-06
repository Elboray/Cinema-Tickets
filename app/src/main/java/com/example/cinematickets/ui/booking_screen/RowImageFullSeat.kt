package com.example.cinematickets.ui.booking_screen

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import com.example.cinematickets.R
import com.example.cinematickets.SpacerHorizontal32Dp

@Composable
fun RowImageFullSeat() {
    val image = listOf(
        R.drawable.chairone,
        R.drawable.five,
        R.drawable.seatthree,
    )
    Row {
        for (element in image) {
            SpacerHorizontal32Dp()
            ImageFullSeat(listOf(element))

        }
    }
}