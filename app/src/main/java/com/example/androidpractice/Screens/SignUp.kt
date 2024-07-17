package com.example.androidpractice.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.androidpractice.Navigations.Route
import com.example.androidpractice.R
import com.example.androidpractice.components.Buttons.ReusableButton
import com.example.androidpractice.components.Variables


@Composable
fun Signup(navController: NavController) {

    Scaffold(modifier = Modifier.fillMaxSize(),
    ) { innerPadding ->

        Surface (modifier = Modifier.padding(innerPadding)
            .background(color = Variables.bgColor)) {


    // Main Content page

    Column(
        Modifier
            .fillMaxWidth()
            .fillMaxSize()
            .padding(15.dp), verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Column(
            Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.Top),
            horizontalAlignment = Alignment.Start,
        ) {
            Text(

                text = "Create Account",
                Modifier
                    .fillMaxWidth()
                    .height(32.dp),
                style = TextStyle(
                    fontSize = 24.sp,
                    lineHeight = 32.sp,
                    fontWeight = FontWeight(700),
                    color = Variables.textInactive,
                )
            )
            Column(
                Modifier
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
            ) {

                Row {

                    Text(
                        text = "Full Name",
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 14.sp,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Medium
                    )
                    Text(text = "*", color = Color.Red)
                }
                OutlinedTextField(modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = Variables.CommonWhite,
                        shape = RoundedCornerShape(size = 6.dp)
                    ),
                    value = "",
                    onValueChange = {},
                    placeholder = {
                        Text(text = "john Doe")
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.AccountCircle,
                            contentDescription = "AccountIcon"
                        )
                    }

                )
            }

            Column(
                Modifier
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
            ) {

                Row {
                    Text(
                        text = "Email ",
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 14.sp,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Medium
                    )
                    Text(text = "*", color = Color.Red)
                }
                OutlinedTextField(modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = Variables.CommonWhite,
                        shape = RoundedCornerShape(size = 6.dp)
                    ),
                    value = "",
                    onValueChange = {},
                    placeholder = {
                        Text(text = "john@example.com")
                    },
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Email, contentDescription = "EmailIcon")
                    }

                )
            }
            Column(
                Modifier
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
            ) {
                // Child views.

                Row {

                    Text(
                        text = "Password",
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 14.sp,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Medium
                    )
                    Text(text = "*", color = Color.Red)
                }
                OutlinedTextField(
                    modifier = Modifier.background( color = Variables.CommonWhite,
                        shape = RoundedCornerShape(size = 6.dp))
                    .fillMaxWidth(),
                    value = "",
                    onValueChange = {},
                    placeholder = {
                        Text(text = "****")
                    },
                    leadingIcon = {
                        Image(
                            modifier = Modifier
                                .width(24.dp)
                                .height(24.dp),
                            painter = painterResource(id = R.drawable.key),
                            contentDescription = "Icon"
                        )
                    }

                )
            }
        }
// Bottom Button functionality
        Column(
            Modifier
                .fillMaxWidth()
                .padding(
                    start = Variables.xSm,
                    end = Variables.xSm
                ),
            verticalArrangement = Arrangement.spacedBy(32.dp, Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

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
                text = "SIGN UP",
                textStyle = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 24.sp,
                    fontWeight = FontWeight(400),
                    color = Color.White,
                    textAlign = TextAlign.Center
                ),
                onClick = {navController.navigate(Route.Home)},
                modifier = Modifier
            )

            Row(
                Modifier
                    .width(291.dp)
                    .height(24.dp),
                horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.Start),
                verticalAlignment = Alignment.CenterVertically,
            ) {

                Text(text = "New here? Create an account.")

                Text(
                    modifier = Modifier
                        .width(66.dp)
                        .height(24.dp)
                        .clickable {
                            navController.navigate(Route.Login)
                        },
                    color = Color.Blue,
                    text = "Log in",
                    textAlign = TextAlign.Center
                )
            }


        }
    }
}}
    }