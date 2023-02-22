package com.bss.uis.presentation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bss.uis.R
import com.bss.uis.presentation.activity.ui.theme.UnityISStrengthTheme

class SearchActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnityISStrengthTheme {
                Screen()
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun Screen() {

    val searchValue = remember { mutableStateOf("") }
    Column(
        Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Row(
            Modifier
                .padding(top = 16.dp, start = 8.dp)
                .fillMaxWidth()
                .height(40.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_arrow_back),
                contentDescription = null
            )
            Text(text = "Search for patients", modifier = Modifier.padding(start = 16.dp))
        }

        OutlinedTextField(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            value = searchValue.value,
            label = {
                Text(text = "Search with key words")
            },
            onValueChange = { searchValue.value = it },
            maxLines = 1,
        )
    }
}

