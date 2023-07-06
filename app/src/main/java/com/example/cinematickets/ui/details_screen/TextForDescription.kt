package com.example.cinematickets.ui.details_screen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cinematickets.R

@Composable
fun TextForDescription() {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 24.dp, start = 30.dp, end = 30.dp),
        text = stringResource(R.string.professor_albus_dumbledore_knows_the_powerful_dark_wizard_gellert_grindelwald_is_moving_to_seize_control_of_the_wizarding_world_unable_to_stop_him_alone_he_entrusts_magizoologist_newt_scamander_to_lead_an_intrepid_team_of_wizards_and_witches_they_soon_encounter_an_array_of_old_and_new_beasts_as_they_clash_with_grindelwald_s_growing_legion_of_followers),
        fontSize = 12.sp,
        fontWeight = FontWeight(500),
        color = Color(0xDE000000),
        textAlign = TextAlign.Center,
        letterSpacing = 0.12.sp
    )
}