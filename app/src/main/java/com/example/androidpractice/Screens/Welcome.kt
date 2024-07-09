package com.example.androidpractice.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidpractice.R
import com.example.androidpractice.components.ReusableButton

object Variables {

    val primary500: Color = Color(0xFF6366F1)
    val textIconographyDarkActive: Color = Color(0xDEFFFFFF)
    val textInactive: Color = Color(0x99000000)
    val Grey200: Color = Color(0xFFEEEEEE)
    val bgColor: Color = Color(0xFFFAFAFA)
    val Grey900: Color = Color(0xFF212121)
    val destructive500: Color = Color(0xFFEF4444)

    val CommonWhite: Color = Color(0xFFFFFFFF)
    val neutral300: Color = Color(0xFFD4D4D4)

    val sm: Dp = 12.dp


    val xSm: Dp = 8.dp
    val MobileView: Dp = 430.dp

}


@Preview(showBackground = true)
@Composable
fun Welcome() {

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
                    .width(170.dp)
                    .height(150.dp)
                    .offset(x = 215.dp, y = 0.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.splashhd),
                contentDescription = "splash1", modifier = Modifier
                    .width(322.71121.dp)
                    .height(215.00276.dp)
                    .offset(x = 0.dp, y = 60.dp)

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

                    .background(
                        color = Variables.Grey200,
                        shape = RoundedCornerShape(size = 999.dp)
                    )

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

                    .background(
                        color = Variables.Grey200,
                        shape = RoundedCornerShape(size = 999.dp)
                    )

            )

            Text(
                modifier = Modifier
                    .width(23.dp)
                    .height(24.dp),
                text = "OR",

                // H6/Semi-Bold
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 24.sp,

                    fontWeight = FontWeight(600),
                    color = Variables.textInactive,
                    textAlign = TextAlign.Center,
                )
            )

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
                onClick = {},
                modifier = Modifier

                    .background(
                        color = Variables.primary500,
                        shape = RoundedCornerShape(size = 999.dp)
                    )

            )
        }
    }
}
