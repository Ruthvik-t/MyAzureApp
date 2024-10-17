package com.ruthvik.apps.myazureapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ruthvik.apps.myazureapp.ui.theme.MyAzureAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyAzureAppTheme {
                Scaffold(modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
                ) { innerPadding ->
                    Greeting(
                        name = "Android Test",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
        color = Color.Black,
        fontStyle = FontStyle.Normal,
        fontSize = 22.sp
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyAzureAppTheme {
        Greeting("Android")
    }
}