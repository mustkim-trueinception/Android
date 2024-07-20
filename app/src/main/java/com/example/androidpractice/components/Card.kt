package com.example.androidpractice.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CostCard(
    modifier: Modifier = Modifier,
    image:@Composable (() -> Unit)? = null,
    text:String = "",
) {
//    Surface(onClick = onClick, shape = Shape) {


    Column(
        modifier = modifier
            .clickable {  }
            .clip(shape = RoundedCornerShape(99.dp))
            .width(113.6.dp)
            .height(145.60001.dp)
           .background(color = Variables.bgColor, shape = RoundedCornerShape(size = Variables.xSm))
            .padding(
                start = Variables.sm,
                top = Variables.xSm,
                end = Variables.sm,
                bottom = Variables.xSm
            )
        ,verticalArrangement = Arrangement.spacedBy(Variables.xSm, Alignment.Top),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        // Child views.


        if (image != null) {
            image()
        }
        Text(
            text = text,
            style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 16.sp,
                    fontWeight = FontWeight(400),
                    color = Variables.textInactive,
                    textAlign = TextAlign.Center,
                )
            )

    }

}
//}