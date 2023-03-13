package com.bss.uis.presentation.activity.ui.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.waitForUpOrCancellation
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toSize
import com.bss.uis.presentation.activity.ui.theme.Purple200

enum class ButtonStateChange { Pressed, Idle }

fun Modifier.bounceClick(onClick: () -> Unit) = composed {
    55
    var buttonStateChange by remember { mutableStateOf(ButtonStateChange.Idle) }
    val scale by animateFloatAsState(if (buttonStateChange == ButtonStateChange.Pressed) 0.85f else 1f)
    this
        .graphicsLayer {
            scaleX = scale
            scaleY = scale
        }
        .clickable(interactionSource = remember { MutableInteractionSource() },
            indication = null,
            onClick = {
                onClick.invoke()
            })
        .pointerInput(buttonStateChange) {
            awaitPointerEventScope {
                buttonStateChange = if (buttonStateChange == ButtonStateChange.Pressed) {
                    waitForUpOrCancellation()
                    ButtonStateChange.Idle
                } else {
                    awaitFirstDown(false)
                    ButtonStateChange.Pressed
                }
            }
        }
}

@Composable
fun DropDownMenuGray(
    modifier: Modifier = Modifier,
    expanded: MutableState<Boolean>,
    listOfAction: List<String>,
    selectedAction: MutableState<String>,
    onItemClick: () -> Unit = {},
) {
    var textFieldSize by remember {
        mutableStateOf(Size.Zero)
    }
    val icon = if (expanded.value) {
        Icons.Filled.KeyboardArrowUp
    } else {
        Icons.Filled.KeyboardArrowDown
    }
    Column(
        modifier = modifier
            .padding(0.dp)
            .fillMaxWidth()
    ) {
        OutlinedTextField(
            value = selectedAction.value,
            enabled = false,
            readOnly = true,
            onValueChange = {
//                selectedAction.value = it
            },
            modifier = Modifier
                .onGloballyPositioned { coordinates ->
                    textFieldSize = coordinates.size.toSize()
                }
                .fillMaxWidth(),
            placeholder = {
                Text(text = selectedAction.value, color = Color.Black)
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                backgroundColor = Color.White,
                unfocusedLabelColor = Purple200,
                cursorColor = Purple200,
                focusedBorderColor = Purple200,
                focusedLabelColor = Purple200,
                unfocusedBorderColor = Color.Gray,
            ),
            textStyle = LocalTextStyle.current.copy(
                fontSize = 14.sp,
                textAlign = TextAlign.Start,
                color = Color.Black
            ),
            trailingIcon = {
                Icon(imageVector = icon,
                    contentDescription = "",
                    tint = Purple200,
                    modifier = Modifier
                        .size(30.dp)
                        .bounceClick { expanded.value = !expanded.value })
            },
        )
        DropdownMenu(
            expanded = expanded.value,
            onDismissRequest = { expanded.value = false },
            modifier = Modifier.width(with(LocalDensity.current) {
                textFieldSize.width.toDp()
            })
        ) {
            listOfAction.forEach { label ->
                DropdownMenuItem(modifier = Modifier.height(50.dp), onClick = {
                    selectedAction.value = label
                    expanded.value = false
                    onItemClick.invoke()
                }) {
                    Text(text = label, fontSize = 14.sp, color = Color.Black)
                }
            }
        }
    }
}