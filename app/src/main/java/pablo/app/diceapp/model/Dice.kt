package pablo.app.diceapp.model

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

data class Dice(
    val number: MutableState<Int> = mutableStateOf(1)
)