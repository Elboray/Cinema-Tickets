package com.example.cinematickets.ui.home_screen

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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cinematickets.R

@Composable
fun ChipComingSoon() {
    Box(
        modifier = Modifier
            .border(
                width = 1.dp, color = Color.White, shape = RoundedCornerShape(size = 24.dp)
            )
            .wrapContentSize(Alignment.Center)

    ) {
        Text(
            text = stringResource(R.string.coming_soon),
            modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp),
            color = Color.White,
            fontSize = 14.sp,
            textAlign = TextAlign.Center
        )
    }
}
