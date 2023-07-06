package com.example.cinematickets.ui.details_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.cinematickets.R
import com.example.cinematickets.ui.theme.Orange

@Composable
fun IconForPlayButton() {
    Image(
        painter = painterResource(id = R.drawable.play_button),
        contentDescription = null,
        contentScale = ContentScale.None,
        modifier = Modifier
            .padding(top = 150.dp)
            .drawBehind {
                drawCircle(
                    color = Orange,
                    radius = 60f
                )
            }
    )
}