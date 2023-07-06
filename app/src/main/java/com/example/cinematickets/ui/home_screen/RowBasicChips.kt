package com.example.cinematickets.ui.home_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.cinematickets.R
import com.example.cinematickets.SpacerHorizontal8Dp

@Composable
fun RowBasicChips() {
    Row(
        modifier = Modifier.wrapContentSize(Alignment.Center),
        Arrangement.Center,
        Alignment.CenterVertically
    ) {
        BasicChip(stringResource(R.string.fantasy))
        SpacerHorizontal8Dp()
        BasicChip(stringResource(R.string.adventure))
    }
}