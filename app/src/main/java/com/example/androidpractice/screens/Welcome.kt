package com.example.androidpractice.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.androidpractice.navigations.Route
import com.example.androidpractice.R
import com.example.androidpractice.components.buttons.ReusableButton
import com.example.androidpractice.components.Variables


@Composable
fun Welcome(navController: NavController) {
    Scaffold(modifier = Modifier.fillMaxSize(),
    )
    { innerPadding ->
        Surface (modifier = Modifier.padding(innerPadding)
            .background(color = Variables.CommonWhite))
        {
    Column(
        Modifier
            .fillMaxWidth()
            .fillMaxSize()
            .padding(15.dp), verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        // Heading Word Hello
        Text(
            modifier = Modifier
                .width(398.dp)
                .height(40.dp),
            text = "Hey, Hello 👋🏻 ",
            style = TextStyle(
                fontSize = 24.sp,
                lineHeight = 32.sp,
                fontWeight = FontWeight(700),
                color = Variables.textInactive,
            )
        )

// Main Image here

        Image(
            modifier = Modifier,
            painter = painterResource(id = R.drawable.all),
            contentDescription = "",
        )

        // Buttons are Used
        Column(
            Modifier
                .fillMaxWidth()
                .padding(
                    start = Variables.xSm,
                    end = Variables.xSm,
                    top = Variables.xSm,
                    bottom = Variables.xSm
                ),
            verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            ReusableButton(
                startIcon = {
                    Image(
                        modifier = Modifier
                            .width(24.dp)
                            .height(24.dp),
                        painter = painterResource(id = R.drawable.google),
                        contentDescription = ""
                    )
                }, colors = ButtonDefaults.buttonColors(Variables.Grey200), onClick = {},
                text = "Continue With Google",
                textStyle = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 24.sp,
                    fontWeight = FontWeight(600),
                    color = Variables.Grey900,
                ),
                modifier = Modifier
            )

            ReusableButton(
                startIcon = {
                    Image(
                        modifier = Modifier
                            .width(24.dp)
                            .height(24.dp),
                        painter = painterResource(id = R.drawable.github),
                        contentDescription = ""
                    )
                }, colors = ButtonDefaults.buttonColors(Variables.Grey200),
                onClick = {},
                text = "Continue With Github",
                textStyle = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 24.sp,
                    fontWeight = FontWeight(600),
                    color = Variables.Grey900,
                ),
                modifier = Modifier
            )

            Text(
                modifier = Modifier
                    .width(23.dp)
                    .height(24.dp),
                text = "OR",

                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 24.sp,
                    fontWeight = FontWeight(600),
                    color = Variables.textInactive,
                    textAlign = TextAlign.Center,
                )
            )
// Bottom button
            ReusableButton(
                endIcon = {
                    Icon(
                        modifier = Modifier
                            .padding(1.dp)
                            .width(20.dp)
                            .height(20.dp),
                        painter = painterResource(id = R.drawable.right),
                        tint = Color.White,
                        contentDescription = ""
                    )
                },
                colors = ButtonDefaults.buttonColors(Variables.primary500),
                text = "Continue With Email",
                textStyle = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 24.sp,
                    fontWeight = FontWeight(400),
                    color = Variables.textIconographyDarkActive,
                    textAlign = TextAlign.Center
                ),
                onClick = { navController.navigate(Route.Signup) },
                modifier = Modifier

            )
        }
    }
}}}
