package com.example.cinematickets.`home-screen`

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
private fun TextTime(text: String) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(imageVector = Icons.Default.Person, contentDescription = null)
            Text(
                modifier = Modifier.padding(start = 6.dp),
                text = text,
                fontSize = 18.sp
            )
        }
        MovieTitle("Fantastic Beasts: The" +
                " Secrets of Dumbledore")
    }
}

@Preview
@Composable
fun TextTimePreview() {
    TextTime("2h 23m")

}