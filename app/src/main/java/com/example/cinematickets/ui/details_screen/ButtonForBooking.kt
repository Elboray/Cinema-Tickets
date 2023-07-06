package com.example.cinematickets.ui.details_screen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cinematickets.R
import com.example.cinematickets.ui.theme.Orange

@Composable
fun ButtonForBooking(onClickBooking: () -> Unit) {
    Button(
        onClick = { onClickBooking() },

        colors = ButtonDefaults.buttonColors(Orange), modifier = Modifier.padding(bottom = 16.dp)
    ) {

        Row() {
            Icon(
                painter = painterResource(id = R.drawable.card),
                contentDescription = null,
            )
            Text(
                modifier = Modifier.padding(start = 6.dp),
                text = stringResource(R.string.booking),
                fontSize = 16.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
                letterSpacing = 0.48.sp
            )
        }


    }
}