package pablo.app.diceapp.ui

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import pablo.app.diceapp.R
import pablo.app.diceapp.model.Dice
import kotlin.random.Random

class MainViewModel: ViewModel() {
    val firstDice = Dice()
    val secondDice = Dice()
    val thirdDice = Dice()
    val fourthDice = Dice()
    val fifthDice = Dice()
    val sixthDice = Dice()

    var expanded = mutableStateOf(false)
    var selectedItem = mutableStateOf(R.string.one_dice)
    var option = mutableStateOf(1)

    fun rollDice(number: MutableState<Int>) {
        number.value = Random.nextInt(1, 7)
    }

    fun roll() {
        firstDice.number.value = Random.nextInt(1, 7)
        secondDice.number.value = Random.nextInt(1, 7)
        thirdDice.number.value = Random.nextInt(1, 7)
        fourthDice.number.value = Random.nextInt(1, 7)
        fifthDice.number.value = Random.nextInt(1, 7)
        sixthDice.number.value = Random.nextInt(1, 7)
    }

    fun getImage(number: Int): MutableState<Int> {
        val result = when(number) {
            1 -> mutableStateOf(R.drawable.dice_1)
            2 -> mutableStateOf(R.drawable.dice_2)
            3 -> mutableStateOf(R.drawable.dice_3)
            4 -> mutableStateOf(R.drawable.dice_4)
            5 -> mutableStateOf(R.drawable.dice_5)
            else -> mutableStateOf(R.drawable.dice_6)
        }
        return result
    }

    fun reset() {
        firstDice.number.value = 1
        secondDice.number.value = 1
        thirdDice.number.value = 1
        fourthDice.number.value = 1
        fifthDice.number.value = 1
        sixthDice.number.value = 1
    }
}