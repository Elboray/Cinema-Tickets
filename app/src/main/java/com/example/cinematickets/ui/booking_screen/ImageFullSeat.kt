package com.example.cinematickets.ui.booking_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ImageFullSeat(image: List<Int>) {

    Image(
        painter = painterResource(id = image[0]),
        contentDescription = null,
        modifier = Modifier
            .offset(x = 0.dp, y = 4.07019.dp)
            .padding(0.dp)
            .width(91.dp)
            .height(80.dp), alignment = Alignment.BottomEnd
    )
}