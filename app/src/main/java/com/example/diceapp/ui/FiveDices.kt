package com.example.diceapp.ui

import android.media.MediaPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun FiveDices(viewModel: MainViewModel, mediaPlayer: MediaPlayer, isOnPortraitMode: Boolean = true) {
    if(isOnPortraitMode) {
        Row {
            Image(
                painter = painterResource(id = viewModel.getImage(viewModel.firstDice.number.value).value),
                contentDescription = viewModel.firstDice.number.toString(),
                modifier = Modifier
                    .clickable {
                        viewModel.rollDice(viewModel.firstDice.number)
                        mediaPlayer.start()
                    }
            )
            Image(
                painter = painterResource(id = viewModel.getImage(viewModel.secondDice.number.value).value),
                contentDescription = viewModel.secondDice.number.toString(),
                modifier = Modifier
                    .clickable {
                        viewModel.rollDice(viewModel.secondDice.number)
                        mediaPlayer.start()
                    }
            )
        }
        Row {
            Image(
                painter = painterResource(id = viewModel.getImage(viewModel.thirdDice.number.value).value),
                contentDescription = viewModel.thirdDice.number.toString(),
                modifier = Modifier
                    .clickable {
                        viewModel.rollDice(viewModel.thirdDice.number)
                        mediaPlayer.start()
                    }
            )
            Image(
                painter = painterResource(id = viewModel.getImage(viewModel.fourthDice.number.value).value),
                contentDescription = viewModel.fourthDice.number.toString(),
                modifier = Modifier
                    .clickable {
                        viewModel.rollDice(viewModel.fourthDice.number)
                        mediaPlayer.start()
                    }
            )
        }
        Image(
            painter = painterResource(id = viewModel.getImage(viewModel.fifthDice.number.value).value),
            contentDescription = viewModel.fifthDice.number.toString(),
            modifier = Modifier
                .clickable {
                    viewModel.rollDice(viewModel.fifthDice.number)
                    mediaPlayer.start()
                }
        )
    }
    else {
        Column {
            Row {
                Image(
                    painter = painterResource(id = viewModel.getImage(viewModel.firstDice.number.value).value),
                    contentDescription = viewModel.firstDice.number.toString(),
                    modifier = Modifier
                        .clickable {
                            viewModel.rollDice(viewModel.firstDice.number)
                            mediaPlayer.start()
                        }
                )
                Image(
                    painter = painterResource(id = viewModel.getImage(viewModel.secondDice.number.value).value),
                    contentDescription = viewModel.secondDice.number.toString(),
                    modifier = Modifier
                        .clickable {
                            viewModel.rollDice(viewModel.secondDice.number)
                            mediaPlayer.start()
                        }
                )
                Image(
                    painter = painterResource(id = viewModel.getImage(viewModel.thirdDice.number.value).value),
                    contentDescription = viewModel.thirdDice.number.toString(),
                    modifier = Modifier
                        .clickable {
                            viewModel.rollDice(viewModel.thirdDice.number)
                            mediaPlayer.start()
                        }
                )
            }
            Row {
                Image(
                    painter = painterResource(id = viewModel.getImage(viewModel.fourthDice.number.value).value),
                    contentDescription = viewModel.fourthDice.number.toString(),
                    modifier = Modifier
                        .clickable {
                            viewModel.rollDice(viewModel.fourthDice.number)
                            mediaPlayer.start()
                        }
                )
                Image(
                    painter = painterResource(id = viewModel.getImage(viewModel.fifthDice.number.value).value),
                    contentDescription = viewModel.fifthDice.number.toString(),
                    modifier = Modifier
                        .clickable {
                            viewModel.rollDice(viewModel.fifthDice.number)
                            mediaPlayer.start()
                        }
                )
            }
        }
    }
}