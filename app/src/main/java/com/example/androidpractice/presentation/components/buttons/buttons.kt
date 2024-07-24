package com.example.androidpractice.presentation.components.buttons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.example.androidpractice.presentation.components.Variables


// Components

@Composable
fun ReusableButton(
    modifier: Modifier = Modifier,
    textStyle: TextStyle =TextStyle(),
    onClick: () -> Unit,
    enabled: Boolean = true,
    colors: ButtonColors = ButtonDefaults.buttonColors(Variables.primary300),
    text: String = "",
    startIcon: @Composable (() -> Unit)? = null,
    endIcon: @Composable (() -> Unit)? = null,
    shape: RoundedCornerShape = RoundedCornerShape(size = 999.dp),
    contentPaddingValues: PaddingValues = PaddingValues(
        start = 18.dp, end = 14.dp, top = 0.dp, bottom = 0.dp),
    horizontalArrangement: Arrangement.Horizontal = Arrangement.spacedBy(
        8.dp, Alignment.CenterHorizontally),
)
{
    Button(
        enabled = enabled,
        modifier = modifier
            .width(382.dp)
            .height(48.dp),
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
                style = textStyle
                ,
            )
            if (endIcon != null) {
                endIcon()
            }
        }
    }
}