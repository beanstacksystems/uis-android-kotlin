package com.bss.uis.presentation.composeDesign

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.bss.uis.presentation.composeDesign.ui.theme.UnityISStrengthTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnityISStrengthTheme {
                // A surface container using the 'background' color from the theme
             MyScreen {

             }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    UnityISStrengthTheme {
        Greeting("Android")
    }
}

@Composable
fun MyAppBar(openDrawer: () -> Unit) {
    TopAppBar(
        title = { Text(text = "My App") },
        navigationIcon = {
            IconButton(onClick = openDrawer) {
                Icon(imageVector = Icons.Default.Menu,
                    contentDescription = "arrow back")
            }
        }
    )
}
@Composable
fun MyScreen(openDrawer: () -> Unit) {
    Column {
        MyAppBar(openDrawer)
        // other composables
    }
}






