package com.androidApi.examples.firstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.androidApi.examples.firstapp.ui.theme.FirstAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Sukrut")
                }
            }
        }
    }
}

@OptIn(ExperimentalUnitApi::class)
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello from First App to $name!",
        modifier = modifier,
        color = Color.Blue,
        textAlign = TextAlign.Center,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        fontSize = TextUnit(20.0f, type = TextUnitType.Sp),
        letterSpacing = TextUnit(0.5f, type = TextUnitType.Em),
        // if maxLines set to 2 we see third line cut out
        // maxLines = 2
        // softWrap = true
        // lineHeight = TextUnit(value = 0.5f, TextUnitType.Sp)
    )
    /*Button(
        onClick = {
            println("Button clicked!")
        },
        modifier = modifier.size(width = 120.dp, height = 40.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Gray),
        content = {
            Text(
                text = "Btn",
            )
        },
        contentPadding = PaddingValues(horizontal = Dp(20f), vertical = Dp(40f)),

        )*/

    Box(
        modifier = modifier
            .offset(x = 80.dp, y = 80.dp)
    )
    {
        Button(
            onClick = {
                println("Button is clicked")
            }, content = {
                Text(text = "Button")
            },
            colors = ButtonDefaults.buttonColors(contentColor = Color.Green)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FirstAppTheme {
        Greeting("Android")
    }
}