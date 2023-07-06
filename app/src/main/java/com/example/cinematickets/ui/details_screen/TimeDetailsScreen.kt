package com.example.cinematickets.ui.details_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.cinematickets.R
import com.example.cinematickets.ui.IconClockCircle
import com.example.cinematickets.ui.TextForTime

@Composable
fun TextTimeScreen(textColor: Color, onClickBack: () -> Unit) {

    Row(horizontalArrangement = Arrangement.Center) {
        Image(
            painter = painterResource(id = R.drawable.close_circle),
            contentDescription = null,
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(top = 24.dp)
                .drawBehind {
                    drawCircle(
                        color = Color(0xFFFFF33),
                        radius = 60f
                    )
                }
                .clickable { onClickBack() }
        )
        Row(modifier = Modifier
            .padding(start = 250.dp, top = 24.dp)
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

    }

}
