package com.example.cinematickets.ui.details_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.cinematickets.R

@Composable
fun BackgroundForDetailsScreen() {
    Image(
        painter = painterResource(id = R.drawable.backgrounddetails),
        contentDescription = null,
        modifier = Modifier
            .height(442.dp)
            .fillMaxWidth(),
        contentScale = ContentScale.FillBounds,
    )
}