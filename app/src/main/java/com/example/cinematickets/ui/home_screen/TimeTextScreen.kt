package com.example.cinematickets.ui.home_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.cinematickets.R
import com.example.cinematickets.ui.IconClockCircle
import com.example.cinematickets.ui.TextForTime

@Composable
fun TextTimeScreen(textColor: Color) {

    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.Center,
        Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier
            .drawBehind {
                drawRoundRect(
                    color = Color(0x33FFFFFF),
                    cornerRadius = CornerRadius(60.0f)
                )
            }
            .width(81.dp)
            .height(25.dp)
            .wrapContentSize(Alignment.Center),
            verticalAlignment = Alignment.CenterVertically

        ) {
            IconClockCircle()
            TextForTime(textColor)

        }
        MovieTitle(stringResource(R.string.fantastic_beasts_the_secrets_of_dumbledore))
    }
}
