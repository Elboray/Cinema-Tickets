package com.example.cinematickets.ui.details_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ImagePerson(image: List<Int>) {
    Image(
        painter = painterResource(id = image[0]),
        contentDescription = null,
        modifier = Modifier
            .clip(CircleShape)
            .width(61.dp)
            .height(61.dp)
    )
}