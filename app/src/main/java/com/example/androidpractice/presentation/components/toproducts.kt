package com.example.androidpractice.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TopProducts(
    modifier: Modifier = Modifier,
    heading: String = "Development Boards",
    image: @Composable (() -> Unit)? = null,
    productname: String = "Arduino Nano RP2040",
    deliverycharges: String = "free delivery",
    price: String? = null,
    mrp: String? = null,
    badge: @Composable (() -> Unit)? = null,
    reviews: String = "1563 reviews",
) {
    Column(
        modifier =
        modifier
            .clip(shape = RoundedCornerShape(8.dp))
            .width(224.dp)
            .padding(start = 12.dp, end = 12.dp, bottom = 8.dp)
            .clickable { },
        verticalArrangement = Arrangement.spacedBy(
            12.dp,
            Alignment.Top
        ),
        horizontalAlignment = Alignment.Start,
    ) {
        Text(
            text = heading,
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 20.sp,
                fontWeight = FontWeight(400),
                fontStyle = FontStyle.Italic,
                color = Variables.textInactive,
            )
        )
//        if (image != null) {
//            image()
//        }
        Text(
            text = productname,
            style = TextStyle(
                fontSize = 16.sp,
                lineHeight = 20.sp,
                fontWeight = FontWeight(400),
                color = Variables.textActive,
            )
        )
        Text(
            text = deliverycharges,

            // P2/Special/Italic
            style = TextStyle(
                fontSize = 12.sp,
                lineHeight = 16.sp,
                fontWeight = FontWeight(400),
                fontStyle = FontStyle.Italic,
                color = Variables.textActive,
            )
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(
                6.dp,
                Alignment.Start
            ),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            if (badge != null) {
                badge()
            }
            Text(
                text = reviews,

                // P2/Special/Italic
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 16.sp,
                    fontWeight = FontWeight(400),
                    fontStyle = FontStyle.Italic,
                    color = Variables.textInactive,
                )
            )
        }
        if (price != null) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(
                    Variables.xSm,
                    Alignment.Start
                ),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = mrp ?: "",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(400),
                        color = Variables.textDisabled,
                        textDecoration = TextDecoration.LineThrough,
                    )
                )
                Text(
                    text = "₹ $price",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        fontWeight = FontWeight(700),
                        color = Variables.Green500,
                    )
                )
            }
        } else {
            Row(
                Modifier
                    .width(82.dp)
                    .height(15.dp)
                    .background(
                        color = Variables.destructive500,
                        shape = RoundedCornerShape(size = 999.dp)
                    ),
                // .padding(start = 3.dp, top = 2.dp, end = 4.dp, bottom = 4.dp)
                horizontalArrangement = Arrangement.spacedBy(
                    4.dp,
                    Alignment.CenterHorizontally
                ),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "out of stock",
                    style = TextStyle(
                        fontSize = 10.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(600),
                        color = Variables.CommonWhite,
                        letterSpacing = 0.2.sp,
                    )
                )
            }
        }
    }
}