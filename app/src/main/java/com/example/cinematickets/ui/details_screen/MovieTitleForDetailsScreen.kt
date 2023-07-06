package com.example.cinematickets.ui.details_screen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cinematickets.R

@Composable
fun MovieTitleForDetailsScreen() {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 24.dp),
        text = stringResource(R.string.fantastic_beasts_the_secrets_of_dumbledore),
        fontSize = 24.sp,
        color = Color(0xDE000000),
        textAlign = TextAlign.Center, fontWeight = FontWeight(500)
    )
}