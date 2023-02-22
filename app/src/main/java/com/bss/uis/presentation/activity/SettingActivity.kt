package com.bss.uis.presentation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bss.uis.R
import com.bss.uis.presentation.activity.ui.components.DropDownMenuGray
import com.bss.uis.presentation.activity.ui.components.bounceClick
import com.bss.uis.presentation.activity.ui.theme.Pink40
import com.bss.uis.presentation.activity.ui.theme.Pink80
import com.bss.uis.presentation.activity.ui.theme.Purple40
import com.bss.uis.presentation.activity.ui.theme.PurpleGrey40

class SettingActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            // A surface container using the 'background' color from the theme
            Surface(
                modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
            ) {
                Greeting(this@SettingActivity)
            }
        }
    }
}

@Composable
fun Greeting(activity: SettingActivity) {
    val listOfColor = mutableListOf(
        Color.Blue, Color.Yellow, Pink80, Purple40, PurpleGrey40, Pink40,
        Color.Red
    )
    val selectedColor = remember {
        mutableStateOf(Color.Blue)
    }
    val openState = remember {
        mutableStateOf(false)
    }
    val list = remember {
        mutableListOf("eng", "hn")
    }
    val selected = remember {
        mutableStateOf("eng")
    }
    Column(Modifier.fillMaxSize()) {
        Row(
            Modifier
                .padding(top = 16.dp, start = 8.dp)
                .fillMaxWidth()
                .height(40.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(painter = painterResource(id = R.drawable.ic_arrow_back),
                contentDescription = null,
                modifier = Modifier.clickable {
                    activity.finish()
                })
            Text(
                text = "Setting",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier.padding(start = 16.dp)
            )
        }

        Text(
            "Language",
            fontSize = 20.sp,
            modifier = Modifier.padding(16.dp)
        )
        DropDownMenuGray(modifier = Modifier
            .padding(start = 16.dp, end = 16.dp)
            .fillMaxWidth(),
            expanded = openState,
            listOfAction = list,
            selectedAction = selected,
            onItemClick = {})


        Text(
            "Themes", fontSize = 20.sp, modifier = Modifier.padding(16.dp)
        )


        Row(
            Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .border(width = 3.dp, color = selectedColor.value, shape = RoundedCornerShape(8.dp))
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Spacer(Modifier.weight(1f))
            for (color in listOfColor) {
                Spacer(
                    Modifier
                        .bounceClick {
                            selectedColor.value = color
                        }
                        .background(color = color)
                        .size(50.dp))
                Spacer(Modifier.weight(1f))
            }
        }


    }
}



