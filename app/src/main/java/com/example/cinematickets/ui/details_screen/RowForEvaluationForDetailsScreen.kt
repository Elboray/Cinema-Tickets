package com.example.cinematickets.ui.details_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.cinematickets.R

@Composable
fun RowForEvaluationForDetailsScreen() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(PaddingValues(start = 70.dp, end = 43.dp))
        ) {

            TextForDetailsScreen(stringResource(R.string._6_8_10))
            TextForDetailsScreen(stringResource(R.string.imdb))

        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(end = 43.dp)
        ) {

            TextForDetailsScreen(stringResource(R.string._63))
            TextForDetailsScreen(stringResource(R.string.rotten_tomatoes))

        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(end = 43.dp)
        ) {
            TextForDetailsScreen(stringResource(R.string._4_10))
            TextForDetailsScreen(stringResource(R.string.ign))
        }
    }
}