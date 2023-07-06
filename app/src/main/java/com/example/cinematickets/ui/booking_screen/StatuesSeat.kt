package com.example.cinematickets.ui.booking_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun StatuesSeat(text: String, image: Int) {
    Row() {
        Image(
            modifier = Modifier
                .offset(x = 0.dp, y = 0.dp)
                .width(13.dp)
                .height(13.dp),
            painter = painterResource(id = image),
            contentDescription = null,
            contentScale = ContentScale.None
        )
        Text(
            text = text,
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight(500),
                color = Color(0xDEFFFFFF),
                textAlign = TextAlign.Center,
                letterSpacing = 0.36.sp,
            )
        )

    }
}