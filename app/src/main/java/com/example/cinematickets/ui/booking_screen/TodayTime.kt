package com.example.cinematickets.ui.booking_screen


import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TodayTime(time: String) {
    Box(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = Color(0xFFE5E5E5),
                shape = RoundedCornerShape(size = 12.dp)
            )
            .wrapContentSize(Alignment.Center)

    ) {
        Text(
            text = time, modifier = Modifier
                .padding(start = 8.dp, top = 5.dp, bottom = 5.dp, end = 8.dp),
            color = Color.Black
        )

    }


}