package com.example.cinematickets.ui.home_screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cinematickets.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HorizontalPagerSimple(onClickCard: () -> Unit) {
    val image = listOf(R.drawable.moviecinema, R.drawable.moviecinema, R.drawable.moviecinema)
    val pagerState = rememberPagerState(1)
    HorizontalPager(
        pageCount = 3,
        state = pagerState,
        contentPadding = PaddingValues(horizontal = 50.dp),
        modifier = Modifier
            .wrapContentSize()
            .padding(bottom = 30.dp)
            .wrapContentHeight()

    ) {
        Box(
            modifier = Modifier
                .padding(bottom = 16.dp)
                .size(width = 260.dp, height = 395.dp),
            contentAlignment = Alignment.Center,

            ) {
            CardWithImage(image = listOf(image[it]), onClickCard)
        }
    }
}
