package com.example.androidpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidpractice.Navigations.navigation
import com.example.androidpractice.components.Variables
import com.example.androidpractice.ui.theme.AndroidPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidPracticeTheme {

                FirstScreen()


            }
        }
    }
}


@Preview
@Composable
fun FirstScreen() {
    Box(
        modifier = Modifier.padding(start = 5.dp, end = 5.dp)
            .width(Variables.MobileView)
            .height(838.46997.dp)
            .background(color = Variables.bgColor),
     contentAlignment = Alignment.Center
    ) {


        navigation()


    }
}

