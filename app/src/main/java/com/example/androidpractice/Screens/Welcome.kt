package com.example.androidpractice.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
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
fun Welcome(navController: NavController) {

    Column(
        Modifier
            .width(398.dp)
            .height(714.dp), verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {   // Heading Word Hello
        Box(
            modifier = Modifier
                .width(398.dp)
                .height(32.dp)
        ) {
            Text(
                text = "Hey, Hello 👋🏻 ",
                style = TextStyle(
                    fontSize = 24.sp,
                    lineHeight = 32.sp,
                    fontWeight = FontWeight(700),
                    color = Variables.textInactive,
                )
            )
        }

        Box(
            modifier = Modifier
                .height(270.dp)
                .width(398.dp)

        ) {

            Image(
                painter = painterResource(id = R.drawable.breadbordpic),
                contentDescription = "", contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .width(175.dp)
                    .height(150.dp)
                    .offset(x = 215.dp, y = 0.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.splashhd),
                contentDescription = "splash1",
                modifier = Modifier .graphicsLayer {
                    rotationZ = 5f
                }
                    .width(322.71121.dp)
                    .height(215.00276.dp)
                    .offset(x = 0.dp, y = 52.dp)

            )
            Image(
                painter = painterResource(id = R.drawable.ss),
                contentDescription = "splash2", modifier = Modifier
                    .width(233.5294.dp)
                    .height(151.84875.dp)
                    .offset(x = 105.dp, y = 140.dp)
            )

        }

        Column(
            Modifier
                .width(398.dp)
                .height(256.dp)
                .padding(
                    start = Variables.xSm,
                    top = Variables.xSm,
                    end = Variables.xSm,
                    bottom = Variables.xSm
                ),
            verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            // Buttons are Used
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
// Bottom
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
                onClick = {navController.navigate(Route.Signup)},
                modifier = Modifier

                    )
        }
    }
}
