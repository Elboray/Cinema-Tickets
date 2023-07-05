package com.example.cinematickets.`home-screen`

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cinematickets.R


@Composable
fun CardWithImage(image:List<Int>) {
    val paddingModifier = Modifier.fillMaxSize()
    Card(shape = RoundedCornerShape(20.dp), elevation = CardDefaults.cardElevation(),modifier = paddingModifier,)
    {
        Image(
            painterResource(image[0]),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize().padding(horizontal = 8.dp)
        )
    }
}

@Preview
@Composable
fun CardWithShapePreview() {
//    CardWithImage(imageList)

}
