package com.example.androidpractice.components

import android.content.res.Resources.Theme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp


// class created for color selection
object Colors {
    val primary500: Color = Color(0xFF6366F1)
    val primary300: Color = Color(0xFFA5B4FC)
    val primary200: Color = Color(0xFF00FD54)
}

// Components

@Composable
fun ReusableButton(
    modifier: Modifier = Modifier,
    textStyle: TextStyle =TextStyle(),
    onClick: () -> Unit,
    enabled: Boolean = true,
    colors: ButtonColors = ButtonDefaults.buttonColors(Colors.primary300),
    text: String = "",
    startIcon: @Composable (() -> Unit)? = null,
    endIcon: @Composable (() -> Unit)? = null,
    shape: RoundedCornerShape = RoundedCornerShape(size = 8.dp),
    contentPaddingValues: PaddingValues = PaddingValues(
        start = 16.dp, end = 16.dp, top = 0.dp, bottom = 0.dp
    ),

    horizontalArrangement: Arrangement.Horizontal = Arrangement.spacedBy(
        8.dp, Alignment.CenterHorizontally
    ),
) {
    Button(
        enabled = enabled,
        modifier = modifier,
        onClick = onClick,
        contentPadding = contentPaddingValues,
        shape = shape,
        colors = colors,
    )
    {
        Row(
            horizontalArrangement = horizontalArrangement,
            verticalAlignment = Alignment.CenterVertically
        ) {

            if (startIcon != null) {
                startIcon()
            }

            Text(
                text = text,
                style = TextStyle(
                    fontStyle = textStyle.fontStyle,
                    fontWeight = textStyle.fontWeight,
                    fontSize = textStyle.fontSize,
                    lineHeight = textStyle.lineHeight,
                    letterSpacing = textStyle.letterSpacing,
                    color = Color.DarkGray
                ),
            )
            if (endIcon != null) {
                endIcon()
            }
        }
    }
}