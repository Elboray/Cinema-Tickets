package com.example.cinematickets.ui.booking_screen

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.cinematickets.R

@Composable
fun TodayDate(time: String) {
    Box(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = Color(0xFFE5E5E5),
                shape = RoundedCornerShape(size = 8.dp)
            )
            .width(45.dp)
            .height(55.dp), contentAlignment = Alignment.Center

    ) {
        Column() {
            Text(
                text = time, modifier = Modifier
                    .padding(horizontal = 4.dp, vertical = 4.dp),
                color = Color.Black, textAlign = TextAlign.Center
            )
            Text(
                text = stringResource(R.string.fri), modifier = Modifier
                    .padding(horizontal = 4.dp, vertical = 4.dp),
                color = Color.Black, textAlign = TextAlign.Center
            )
        }


    }
}