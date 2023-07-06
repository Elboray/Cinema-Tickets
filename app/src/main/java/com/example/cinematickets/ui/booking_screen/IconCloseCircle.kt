package com.example.cinematickets.ui.booking_screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.cinematickets.R

@Composable
fun IconCloseCircle(onClickBack: () -> Unit) {
    Image(
        painter = painterResource(id = R.drawable.close_circle),
        contentDescription = null,
        contentScale = ContentScale.None,
        modifier = Modifier
            .padding(top = 24.dp, start = 24.dp)
            .drawBehind {
                drawCircle(
                    color = Color(0xFFFFF33),
                    radius = 60f
                )
            }
            .clickable { onClickBack() }
    )
}