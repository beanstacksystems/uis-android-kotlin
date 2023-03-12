package com.bss.uis.presentation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bss.uis.R
import com.bss.uis.helper.getListOfDataType
import com.bss.uis.presentation.activity.ui.components.DropDownMenuGray
import com.bss.uis.presentation.activity.ui.theme.Pink80
import com.bss.uis.presentation.activity.ui.theme.UnityISStrengthTheme

class ChangeServiceActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            UnityISStrengthTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                    ChangeServiceScreen(this@ChangeServiceActivity)
                }
            }
        }
    }

}


@Composable
fun ChangeServiceScreen(activity: ChangeServiceActivity? = null) {

    val context = LocalContext.current

    val openState = remember {
        mutableStateOf(false)
    }
    val pairs = remember {
        mutableListOf<Pair<String, String>>()
    }
    getListOfDataType("userrole", pairs, context)
    val list = pairs.map { "${it.first} -> ${it.second} " }

//        remember {
//        mutableListOf<String>()
//    }
//    pairedList.forEach {
//        list.add(it.second)
//    }


    val selected = remember {
        mutableStateOf("select your role")
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
                    activity?.finish()
                })
            Text(
                text = "Change Service",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier.padding(start = 16.dp),
                color = Color.Black
            )
        }
        Spacer(modifier = Modifier.height(100.dp))
        DropDownMenuGray(modifier = Modifier
            .padding(start = 16.dp, end = 16.dp)
            .fillMaxWidth(),
            expanded = openState,
            listOfAction = list,
            selectedAction = selected,
            onItemClick = {})

        Spacer(modifier = Modifier.weight(1f))
        Text(
            "CHANGE",
            fontSize = 20.sp,
            modifier = Modifier
                .padding(24.dp)
                .fillMaxWidth()
                .background(color = Pink80, shape = RoundedCornerShape(8.dp))
                .padding(16.dp),
            color = Color.Black,
            textAlign = TextAlign.Center
        )


    }
}




