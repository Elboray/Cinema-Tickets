package com.example.cinematickets.ui.home_screen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cinematickets.SpacerHorizontal8Dp

@Composable
fun RowChips() {
    Row(
        modifier = Modifier.padding(
            bottom = 33.dp,
            start = 48.dp,
            end = 48.dp,
            top = 49.dp
        )
    ) {
        ChipShowingSoon()
        SpacerHorizontal8Dp()
        ChipComingSoon()
    }
}