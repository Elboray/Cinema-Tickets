package com.example.cinematickets.ui.details_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.cinematickets.R
import com.example.cinematickets.ui.home_screen.BasicChip
import com.example.cinematickets.SpacerHorizontal8Dp

@Composable
fun RowForChips() {
    Row(
        modifier = Modifier
            .wrapContentSize(Alignment.Center)
            .padding(bottom = 24.dp),
        Arrangement.Center
    ) {
        BasicChip(stringResource(R.string.fantasy))
        SpacerHorizontal8Dp()
        BasicChip(stringResource(R.string.adventure))
    }
}