package com.example.cinematickets.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cinematickets.R

@Composable
fun TextForTime(textColor: Color) {
    Text(
        modifier = Modifier.padding(top = 5.dp, bottom = 5.dp, end = 8.dp),
        text = stringResource(R.string._2h_23m),
        style = TextStyle(
            fontSize = 12.sp,
            fontWeight = FontWeight(500),
            color = textColor,
        ), textAlign = TextAlign.Center
    )
}