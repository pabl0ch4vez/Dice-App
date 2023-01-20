package com.example.diceapp.ui

import android.media.MediaPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun OneDice(viewModel: MainViewModel, mediaPlayer: MediaPlayer) {
    Image(
        painter = painterResource(id = viewModel.getImage(viewModel.firstDice.number.value).value),
        contentDescription = viewModel.firstDice.number.toString(),
        modifier = Modifier
            .clickable {
                viewModel.rollDice(viewModel.firstDice.number)
                mediaPlayer.start()
            }
    )
}