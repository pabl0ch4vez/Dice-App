package pablo.app.diceapp.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import pablo.app.diceapp.R

@Composable
fun Menu(viewModel: MainViewModel) {
    Column {
        TextButton(onClick = { viewModel.expanded.value = true }) {
            Row {
                Text(text = stringResource(id = viewModel.selectedItem.value))
                Icon(Icons.Default.ArrowDropDown, contentDescription = "ArrowDropDown")
            }
        }
        DropdownMenu(expanded = viewModel.expanded.value, onDismissRequest = { viewModel.expanded.value = false }) {
            DropdownMenuItem(
                onClick = {
                    viewModel.expanded.value = false
                    viewModel.selectedItem.value = R.string.one_dice
                    viewModel.option.value = 1
                    viewModel.reset()
                }
            ) {
                Text(text = stringResource(id = R.string.one_dice))
            }
            DropdownMenuItem(
                onClick = {
                    viewModel.expanded.value = false
                    viewModel.selectedItem.value = R.string.two_dices
                    viewModel.option.value = 2
                    viewModel.reset()
                }
            ) {
                Text(text = stringResource(id = R.string.two_dices))
            }
            DropdownMenuItem(
                onClick = {
                    viewModel.expanded.value = false
                    viewModel.selectedItem.value = R.string.three_dices
                    viewModel.option.value = 3
                    viewModel.reset()
                }
            ) {
                Text(text = stringResource(id = R.string.three_dices))
            }
            DropdownMenuItem(
                onClick = {
                    viewModel.expanded.value = false
                    viewModel.selectedItem.value = R.string.four_dices
                    viewModel.option.value = 4
                    viewModel.reset()
                }
            ) {
                Text(text = stringResource(id = R.string.four_dices))
            }
            DropdownMenuItem(
                onClick = {
                    viewModel.expanded.value = false
                    viewModel.selectedItem.value = R.string.five_dices
                    viewModel.option.value = 5
                    viewModel.reset()
                }
            ) {
                Text(text = stringResource(id = R.string.five_dices))
            }
            DropdownMenuItem(
                onClick = {
                    viewModel.expanded.value = false
                    viewModel.selectedItem.value = R.string.six_dices
                    viewModel.option.value = 6
                    viewModel.reset()
                }
            ) {
                Text(text = stringResource(id = R.string.six_dices))
            }
        }
    }
}