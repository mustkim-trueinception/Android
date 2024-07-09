package com.example.androidpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidpractice.Screens.Login
import com.example.androidpractice.Screens.Signup
import com.example.androidpractice.Screens.Variables
import com.example.androidpractice.Screens.Welcome
import com.example.androidpractice.components.pre
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
    Column(
        modifier = Modifier
            .width(Variables.MobileView)
            .height(838.46997.dp)
            .background(color = Variables.bgColor)

            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


         //Login()
       Welcome()
        //Signup()
        //pre()
    }}

