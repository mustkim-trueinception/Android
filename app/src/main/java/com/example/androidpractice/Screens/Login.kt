package com.example.androidpractice.Screens


import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxColors
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.androidpractice.Navigations.Route
import com.example.androidpractice.R
import com.example.androidpractice.components.ReusableButton
import com.example.androidpractice.components.Variables




@Composable
fun Login(navController: NavController) {

    var checked by remember { mutableStateOf(true) }

    Column(
        Modifier
            .width(398.dp)
            .height(714.dp), verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .width(398.dp)
                .height(714.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .width(398.dp)
                    .height(280.dp)
            ) {
                Text(
                    text = "Hey, Hello 👋🏻 ",
                    style = TextStyle(
                        fontSize = 24.sp,
                        lineHeight = 32.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight(700),
                        color = Color.Gray,
                    ),
                    modifier = Modifier
                        .width(398.dp)
                        .height(32.dp)
                )
                // Email
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .width(398.dp)
                        .height(68.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
                        verticalAlignment = Alignment.Top,
                    ) {
                        Text(
                            text = "Email",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight(600),
                                color = Color.Black,
                            ),
                            modifier = Modifier
                                .width(38.dp)
                                .height(20.dp)
                        )
                        Text(
                            text = "*",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight(600),
                                color = Color.Red
                            )
                        )
                    }
                    OutlinedTextField(modifier = Modifier.fillMaxWidth(),
                        value = "",
                        onValueChange = {},
                        placeholder = {
                            Text(text = "john@example.com")
                        },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Email,
                                contentDescription = "EmailIcon"
                            )
                        }
                    )
                }

                // PassWord filling
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .width(398.dp)
                        .height(68.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
                        verticalAlignment = Alignment.Top,
                    ) {
                        Text(
                            text = "Password",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight(600),
                                color = Color.Black
                            ),
                            modifier = Modifier
                                .width(66.dp)
                                .height(20.dp)
                        )
                        Text(
                            text = "*",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight(600),
                                color = Color.Red
                            )
                        )
                    }

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(
                            12.dp,
                            Alignment.CenterHorizontally
                        ),
                        verticalAlignment = Alignment.CenterVertically,
                    )
                    {
                        OutlinedTextField(modifier = Modifier.fillMaxWidth(),
                            value = "",
                            onValueChange = {},
                            placeholder = {
                                Text(text = "****")
                            },
                            leadingIcon = {
                                Image(
                                    painter = painterResource(id = R.drawable.key),
                                    contentDescription = "PassIcon",
                                    contentScale = ContentScale.None,
                                )
                            }
                        )

                    }
                }
                // Check Box Functionality
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        checked = checked,
                        onCheckedChange = { checked = it },
                        colors = CheckboxDefaults.colors(Variables.primary500)
                    )
                    Text(text = "Remember Me")
                }
            }


            // Botton Login Button
            Column(
                Modifier
                    .width(398.dp)
                    .height(104.dp),
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
                    text = "LOGIN",
                    textStyle = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 24.sp,
                        fontWeight = FontWeight(400),
                        color = Color.White,
                        textAlign = TextAlign.Center
                    ),
                    onClick = {},
                    modifier = Modifier

                )

                Row(
                    Modifier
                        .width(291.dp)
                        .height(24.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                ) {

                    Text(text = "New here? Create an account.")

                    Text(
                        modifier = Modifier
                            .width(86.dp)
                            .height(24.dp)

                            .clickable { navController.navigate(Route.Signup) },
                        color = Color.Blue,
                        text = "Sign up",
                        textAlign = TextAlign.Center
                    )
                }


            }
        }


    }
}