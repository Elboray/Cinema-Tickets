package com.example.cinematickets.ui.booking_screen

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cinematickets.SpacerHorizontal16Dp
import com.example.cinematickets.SpacerHorizontal4Dp

@Preview
@Composable
fun LazyRowTodayDate() {
    LazyRow(modifier = Modifier.padding(bottom = 32.dp)) {
        item {
            val time: List<String> = listOf(
                "10",
                "12",
                "11",
                "13",
                "17",
                "15",
                "12",
                "11",
                "13",
                "17",
                "13",
                "17",
                "15",
                "12",
                "11",
                "13"
            )
            SpacerHorizontal16Dp()
            for (element in time) {
                SpacerHorizontal4Dp()
                TodayDate(element)
            }

        }

    }


}