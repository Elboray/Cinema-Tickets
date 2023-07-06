package com.example.cinematickets.ui.booking_screen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cinematickets.R
import com.example.cinematickets.SpacerHorizontal32Dp

@Preview
@Composable
fun RowStatuesSeat() {
    Row(
        modifier = Modifier
            .wrapContentSize(Alignment.Center)
            .padding(start = 100.dp, top = 600.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        StatuesSeat(text = stringResource(R.string.available), image = R.drawable.white)
        SpacerHorizontal32Dp()
        StatuesSeat(text = stringResource(R.string.taken), image = R.drawable.gray)
        SpacerHorizontal32Dp()
        StatuesSeat(text = stringResource(R.string.selected), image = R.drawable.orange)
    }
}