package pablo.app.diceapp.ui

import android.content.res.Configuration
import android.media.MediaPlayer
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import pablo.app.diceapp.R
import pablo.app.diceapp.ui.theme.DiceAppTheme

@Composable
fun DiceApp(viewModel: MainViewModel) {
    val mediaPlayer: MediaPlayer = MediaPlayer.create(LocalContext.current, R.raw.dice_sound)
    val config = LocalConfiguration.current
    val portraitMode = remember { mutableStateOf(config.orientation) }
    var isOnPortraitMode = true
    if(portraitMode.value != Configuration.ORIENTATION_PORTRAIT) {
        isOnPortraitMode = false
    }

    DiceAppTheme {
        if(isOnPortraitMode) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colors.background)
                    .wrapContentSize(Alignment.Center),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Menu(viewModel)
                Spacer(Modifier.height(25.dp))
                when(viewModel.option.value) {
                    1 -> OneDice(viewModel, mediaPlayer)
                    2 -> TwoDices(viewModel, mediaPlayer)
                    3 -> ThreeDices(viewModel, mediaPlayer)
                    4 -> FourDices(viewModel, mediaPlayer)
                    5 -> FiveDices(viewModel, mediaPlayer)
                    else -> SixDices(viewModel, mediaPlayer)
                }
                Spacer(Modifier.height(25.dp))
                Button(
                    onClick = {
                        viewModel.roll()
                        mediaPlayer.start()
                    }
                ) {
                    Text(text = stringResource(id = R.string.roll))
                }
            }
        }
        else {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colors.background)
                    .wrapContentSize(Alignment.Center),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth(0.2f),
                    horizontalAlignment = Alignment.Start
                ) {
                    Menu(viewModel)
                    Spacer(Modifier.height(25.dp))
                    Button(
                        onClick = {
                            viewModel.roll()
                            mediaPlayer.start()
                        }
                    ) {
                        Text(text = stringResource(id = R.string.roll))
                    }
                }


                when(viewModel.option.value) {
                    1 -> OneDice(viewModel, mediaPlayer)
                    2 -> TwoDices(viewModel, mediaPlayer)
                    3 -> ThreeDices(viewModel, mediaPlayer)
                    4 -> FourDices(viewModel, mediaPlayer, false)
                    5 -> FiveDices(viewModel, mediaPlayer, false)
                    else -> SixDices(viewModel, mediaPlayer, false)
                }
            }
        }
    }
}