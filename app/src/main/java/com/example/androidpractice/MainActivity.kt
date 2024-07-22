package com.example.androidpractice


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Modifier
import com.example.androidpractice.components.Variables
import com.example.androidpractice.navigations.Navigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                Column(
                    modifier = Modifier
                        .background(color = Variables.bgColor),
                ) {
                  // MainCont()
                    Navigation()
                }
            }
        }
    }


