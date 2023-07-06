package com.example.cinematickets.ui.details_screen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cinematickets.R
import com.example.cinematickets.SpacerHorizontal4Dp

@Composable
fun LazyRowForImagePerson() {
    val image = listOf(
        R.drawable.personone,
        R.drawable.persontwo,
        R.drawable.personthree,
        R.drawable.personfour,
        R.drawable.personfive,
        R.drawable.personone,
        R.drawable.persontwo,
        R.drawable.personthree,
        R.drawable.personfour,
        R.drawable.personfive,
    )
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 24.dp, start = 16.dp)
    ) {
        item {

            for (element in image) {
                SpacerHorizontal4Dp()
                ImagePerson(listOf(element))

            }

        }
    }
}