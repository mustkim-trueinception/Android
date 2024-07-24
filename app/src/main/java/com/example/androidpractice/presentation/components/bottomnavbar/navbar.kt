package com.example.androidpractice.presentation.components.bottomnavbar

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androidpractice.R
import com.example.androidpractice.presentation.components.buttons.CostIconButton
import com.example.androidpractice.presentation.components.Variables

@Composable
fun Navbar(){
    Row (modifier = Modifier
        .shadow(elevation = 6.dp, spotColor = Color(0x1A101828), ambientColor = Color(0x1A101828))
        .shadow(elevation = 15.dp, spotColor = Color(0x1A101828), ambientColor = Color(0x1A101828))
        .border(width = 1.dp, color = Variables.ShadesOfGray300)
        .fillMaxWidth()
        .height(80.dp)
        .background(color = Variables.ShadesOfGray50),
        verticalAlignment = Alignment.CenterVertically

    ) {
        CostIconButton(
            modifier = Modifier.weight(1f),
            text = "Home",
            onClick = {  },
            icon = {
                Image(
                    modifier = Modifier
                        .padding(1.dp)
                        .width(30.dp)
                        .height(30.dp),
                    painter = painterResource(id = R.drawable.home),
                    contentDescription = ""
                )
            })

        CostIconButton(
            modifier = Modifier.weight(1f),
            text = "Offers",
            onClick = { },
            icon = {
                Image(
                    modifier = Modifier
                        .padding(1.dp)
                        .width(30.dp)
                        .height(30.dp),
                    painter = painterResource(id = R.drawable.offer),
                    contentDescription = ""
                )
            })
        CostIconButton(
            modifier = Modifier.weight(1f),
            text = "Category",
            onClick = {  },
            icon = {
                Image(
                    modifier = Modifier
                        .padding(1.dp)
                        .width(30.dp)
                        .height(30.dp),
                    painter = painterResource(id = R.drawable.category),
                    contentDescription = ""
                )
            })
        CostIconButton(
            modifier = Modifier.weight(1f),
            text = "Contact",
            onClick = { },
            icon = {
                Image(
                    modifier = Modifier
                        .padding(1.dp)
                        .width(30.dp)
                        .height(30.dp),
                    painter = painterResource(id = R.drawable.phone),
                    contentDescription = ""
                )
            })
        CostIconButton(
            modifier = Modifier.weight(1f),
            text = "My Profile",
            onClick = { },
            icon = {
                Image(
                    modifier = Modifier
                        .padding(1.dp)
                        .width(30.dp)
                        .height(30.dp),
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = ""
                )
    })

    }
    }
