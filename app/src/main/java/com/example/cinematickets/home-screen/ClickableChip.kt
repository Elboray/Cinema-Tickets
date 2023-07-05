package com.example.cinematickets.`home-screen`

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Chip
import androidx.wear.compose.material.ChipDefaults

@Composable
fun ClickableChip(text:String) {
    var isSelected by rememberSaveable{
        mutableStateOf(false)
    }
    val backgroundColor = if (isSelected) Color.Blue else Color.Gray

    Chip(
        onClick = { isSelected = !isSelected },
        colors = ChipDefaults.chipColors(
            backgroundColor = backgroundColor,
            contentColor = Color.White
        )
    , modifier = Modifier.size(width = 75.dp, height = 29.dp)
    ) {
        Text(text = text)
    }
}
@Preview
@Composable
fun ClickableChipPreview() {
    ClickableChip("Showing now")

}