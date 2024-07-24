package com.example.androidpractice.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidpractice.R


@Composable
fun CostomBadge(
    rating: Double = 4.8
) {
    Row(
        Modifier
        .width(39.dp)
        .height(20.dp)
        .background(color = Variables.primary500, shape = RoundedCornerShape(size = 999.dp))
        .padding(start = 4.dp, end = 4.dp),
        horizontalArrangement = Arrangement.spacedBy(3.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(modifier = Modifier
            ,
            text = rating.toString(),
            style = TextStyle(
                fontSize = 9.sp,
                lineHeight = 16.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight(600),
                color = Variables.textIconographyDarkActive,
                letterSpacing = 0.2.sp,
            )
        )

        Image(modifier = Modifier.size(12.dp).padding(bottom = 2.dp),
        painter = painterResource(id = R.drawable.staricon),
        contentDescription = "image description",

    )

    }
}
