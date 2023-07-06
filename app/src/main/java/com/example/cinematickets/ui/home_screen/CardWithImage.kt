package com.example.cinematickets.ui.home_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource


@Composable
fun CardWithImage(image: List<Int>, onClickCard: () -> Unit) {
    Image(
        painterResource(image[0]),
        contentDescription = null,
        modifier = Modifier
            .fillMaxSize()
            .clickable { onClickCard() },
        contentScale = ContentScale.FillBounds,
    )
}

