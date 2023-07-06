package com.example.cinematickets.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.cinematickets.R

@Composable
fun IconClockCircle() {
    Icon(
        painter = painterResource(id = R.drawable.clock_circle),
        contentDescription = null,
        modifier = Modifier.padding(start = 8.dp, top = 5.dp, bottom = 5.dp, end = 8.dp),
        tint = Color.Gray,

        )
}