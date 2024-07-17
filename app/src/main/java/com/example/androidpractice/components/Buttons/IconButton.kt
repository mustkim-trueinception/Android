package com.example.androidpractice.components.Buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidpractice.components.Variables

@Composable
fun CostIconButton( onClick: () -> Unit,
                    modifier: Modifier = Modifier,
                    enabled: Boolean = true,
                    Icon:@Composable (() -> Unit)? = null,
                    shape: RoundedCornerShape = RoundedCornerShape(size = Variables.md),
                    Text:String = ""


) {

        Surface(
            shape = shape,
            modifier = modifier
                .padding(start = Variables.xSm, top = Variables.xSm, end = Variables.xSm, bottom = Variables.xSm),
            onClick = onClick,
            enabled = enabled,

            )
        {
            Column(modifier = Modifier.background(color = Variables.bgColor),
                verticalArrangement = Arrangement.spacedBy(Variables.xxSm, Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {

                if (Icon!= null) {
                    Icon()
                }
                Text(
                    text = Text,
                    style = TextStyle(
                        fontSize = 11.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(400),
                        color = Variables.textInactive,
                    )
                    )



            }
        }
    }

