package com.example.cinematickets.ui.home_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.cinematickets.R
import com.example.cinematickets.SpacerHorizontal4Dp
import com.example.cinematickets.ui.theme.Orange


@Composable
fun BottomAppBarCompose() {
    BottomAppBar(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 70.dp)
            .background(
                color = Color.White,
            ), containerColor = Color.White

    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(36.dp, Alignment.CenterHorizontally),
        ) {
            Image(

                painter = painterResource(id = R.drawable.homemovie),
                contentDescription = null,
                contentScale = ContentScale.None,
                modifier = Modifier
                    .padding(start = 24.dp)
                    .drawBehind {
                        drawCircle(
                            color = Orange,
                            radius = 60f
                        )
                    },
            )
            SpacerHorizontal4Dp()
            Image(
                painter = painterResource(id = R.drawable.search),
                contentDescription = null,
                contentScale = ContentScale.None
            )
            SpacerHorizontal4Dp()
            Row(
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ticket),
                    contentDescription = null,
                    contentScale = ContentScale.None
                )


                Text(
                    color = Color.White,
                    modifier = Modifier
                        .padding(PaddingValues(4.dp))
                        .drawBehind {
                            drawCircle(
                                color = Orange,
                                radius = 20f
                            )
                        },
                    text = "5",
                    style = MaterialTheme.typography.bodySmall
                )

            }
            SpacerHorizontal4Dp()
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = null,
                contentScale = ContentScale.None
            )
        }

    }
}