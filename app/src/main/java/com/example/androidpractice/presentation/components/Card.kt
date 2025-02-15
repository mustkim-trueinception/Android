package com.example.androidpractice.presentation.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CostCard(
    modifier: Modifier = Modifier,
    img: DynamicImageSource,
    image:@Composable (() -> Unit)? = null,
    text:String = "")
{
    Column(
        modifier = modifier
            .requiredWidth(120.dp)
            .clip(shape = RoundedCornerShape(8.dp))
            .clickable { Log.d("TopCategories", " is clicked moving to $") }
            .background(color = Variables.bgColor, shape = RoundedCornerShape(size = Variables.xSm))
            .padding(
                start = Variables.sm,
                top = Variables.xSm,
                end = Variables.sm,
                bottom = Variables.xSm
            ),
        verticalArrangement = Arrangement.spacedBy(Variables.xSm, Alignment.Top),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        if (image != null) {
            image()
        }

        DynamicImage(
            imageSource = img,
            customization = ImageCustomization(
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(90.dp)
                    .clip(CircleShape),
            ),
        )


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
