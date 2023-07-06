package com.example.cinematickets.ui.booking_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cinematickets.R

@Preview
@Composable
fun PriceTickets() {

    Column(modifier = Modifier.padding(start = 30.dp)) {
        Text(
            text = stringResource(R.string._100_00),
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight(500),
                color = Color(0xDE000000),
                textAlign = TextAlign.Center,
                letterSpacing = 0.72.sp,
            )
        )
        Text(
            text = stringResource(R.string._4_tickets),
            style = TextStyle(
                fontSize = 12.sp,
                lineHeight = 19.86.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFFB5B5B5),
                textAlign = TextAlign.Center,
                letterSpacing = 0.36.sp,
            )
        )
    }
}