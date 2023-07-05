package com.example.cinematickets.`home-screen`

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.Chip
import androidx.wear.compose.material.ChipDefaults
import androidx.wear.compose.material.Text

@Composable
fun BasicChip(text: String) {
    Chip(
        modifier = Modifier.size(width = 75.dp, height = 29.dp),
        onClick = {},
        colors = ChipDefaults.chipColors(Color.White)
    ) {
        Text(
            text = text,
            color = Color.Black,
            fontSize = 12.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
fun BasicChipPreview() {
    BasicChip(text = "Fantasy")

}