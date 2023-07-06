package com.example.cinematickets.ui.booking_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ImageFullSeatForBackground() {
    Column(
        modifier = Modifier.padding(start = 15.dp, end = 15.dp, top = 150.dp)
    ) {
        RowImageFullSeat()
        RowImageFullSeat()
        RowImageFullSeat()
        RowImageFullSeat()
        RowImageFullSeat()
    }

}
