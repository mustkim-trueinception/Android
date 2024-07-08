package com.example.androidpractice.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
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


        val xSm: Dp = 8.dp
        val MobileView: Dp = 430.dp

}


@Preview(showBackground = true)
@Composable
fun Welcome(){

    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally)
    {   // Heading Word Hello
        Box(modifier = Modifier
            .width(398.dp)
            .height(32.dp)){
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
      // main Images
        Column(
            Modifier
                .width(398.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Box (modifier = Modifier
                .height(600.dp)
                .width(300.dp)
            ){

                Image(modifier = Modifier
                    .width(217.48833.dp)
                    .height(194.57796.dp).offset(x = 200.dp, y = 115.dp),
                    painter = painterResource(id = R.drawable.orangeshape),
                    contentDescription = "image description",
                    contentScale = ContentScale.FillBounds
                )
                Image(modifier =
                Modifier
                    .width(352.71121.dp)
                    .height(235.00276.dp)
                    .offset(x = -10.dp, y = 210.dp),
                    painter = painterResource(id = R.drawable.tri),
                    contentDescription = "image description",
                    contentScale = ContentScale.FillBounds
                )
                Image(modifier = Modifier
                    .width(190.5294.dp)
                    .height(190.84875.dp)
                    .offset(x = 100.dp, y = 270.dp),
                    painter = painterResource(id = R.drawable.image),
                    contentDescription = "image description",
                    contentScale = ContentScale.FillBounds
                )
            }

            Column(
                verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                // Buttons are Used
            ReusableButton(
                startIcon = { Image(modifier = Modifier
                .width(24.dp)
                .height(24.dp),painter = painterResource(id = R.drawable.google), contentDescription = "") },colors = ButtonDefaults.buttonColors(Variables.Grey200),onClick = {},
                text = "Continue With Google",
                textStyle = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 24.sp,
                        fontWeight = FontWeight(600),
                        color = Variables.Grey900,),
                 modifier = Modifier
                 .width(382.dp)
                 .height(48.dp)
                 .background(
                     color = Variables.Grey200,
                     shape = RoundedCornerShape(size = 999.dp))
                 .padding(
                     start = 32.dp,
                     top = Variables.xSm,
                     end = 32.dp,
                     bottom = Variables.xSm))


                ReusableButton(startIcon = { Image(modifier = Modifier
                    .width(24.dp)
                    .height(24.dp),painter = painterResource(id = R.drawable.github), contentDescription = "") },colors = ButtonDefaults.buttonColors(Variables.Grey200),onClick = {},
                    text = "Continue With Github",
                    textStyle = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 24.sp,
                        fontWeight = FontWeight(600),
                        color = Variables.Grey900,
                    )
                    ,
                    modifier = Modifier
                        .width(382.dp)
                        .height(48.dp)
                        .background(
                            color = Variables.Grey200,
                            shape = RoundedCornerShape(size = 999.dp)
                        )
                        .padding(
                            start = 32.dp,
                            top = Variables.xSm,
                            end = 32.dp,
                            bottom = Variables.xSm
                        ))

                Text(modifier = Modifier
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

            ReusableButton(endIcon = { Image(
                modifier = Modifier
                    .padding(1.dp)
                    .width(20.dp)
                    .height(20.dp),painter = painterResource(id = R.drawable.right ), contentDescription = "")},
                colors = ButtonDefaults.buttonColors(Variables.primary500),
                text = "Continue With Email",
                textStyle = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 24.sp,
                    fontWeight = FontWeight(400),
                    color = Variables.textIconographyDarkActive,
                    textAlign = TextAlign.Center),
                   onClick = {},
                modifier = Modifier
                    .width(382.dp)
                    .height(48.dp)
                    .background(
                        color = Variables.primary500,
                        shape = RoundedCornerShape(size = 999.dp)
                    )
                    .padding(
                        start = 32.dp,
                        top = Variables.xSm,
                        end = 32.dp,
                        bottom = Variables.xSm
                    ))
        }}
    }
}