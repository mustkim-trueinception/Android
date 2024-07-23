package com.example.androidpractice.components.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.androidpractice.components.Variables

@Composable
fun CostIconButton(
                    modifier: Modifier = Modifier,
                    onClick: () -> Unit,
                    enabled: Boolean = true,
                    icon:@Composable (() -> Unit)? = null,
                    shape: RoundedCornerShape = RoundedCornerShape(size = Variables.md),
                    text:String = "")
       {
        Surface(
            shape = shape,
            modifier = modifier
                .padding(
                    start = Variables.xSm,
                    top = Variables.xSm,
                    end = Variables.xSm,
                    bottom = Variables.xSm),
            onClick = onClick,
            enabled = enabled,

            )
        {
            Column(modifier = Modifier.background(color = Variables.bgColor),
                verticalArrangement = Arrangement.spacedBy(Variables.xxSm, Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                if (icon!= null) {
                    icon()
                }
                Text(
                    text = text,
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

