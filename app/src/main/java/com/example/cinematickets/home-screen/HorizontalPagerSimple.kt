package com.example.cinematickets.`home-screen`

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cinematickets.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HorizontalPagerSimple() {
    val image= listOf(R.drawable.moviecinema,R.drawable.moviecinema,R.drawable.homemovie)
    val pagerState = rememberPagerState()
    HorizontalPager(pageCount = 3, state = pagerState, contentPadding = PaddingValues(horizontal =  50.dp),) {
        Box(modifier = Modifier
            .fillMaxWidth().height(500.dp),
            contentAlignment = Alignment.Center,

        ) {
           CardWithImage(image = listOf(image[it]))
        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun HorizontalPagerSimplePre() {
    HorizontalPagerSimple()

}