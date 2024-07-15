package com.example.androidpractice.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.androidpractice.R
import com.example.androidpractice.components.Buttons.CostIconButton
import com.example.androidpractice.components.CostCard
import com.example.androidpractice.components.Variables


@Composable
fun mainpage(navController: NavController) {

    Scaffold(


        bottomBar = {
            NavigationBar {

                // Costom navigation bar with icon and text

                CostIconButton(
                    modifier = Modifier.weight(1f),
                    Text = "Home",
                    onClick = { /*TODO*/ },
                    Icon = {
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
                    Text = "Offers",
                    onClick = { /*TODO*/ },
                    Icon = {
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
                    Text = "Category",
                    onClick = { /*TODO*/ },
                    Icon = {
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
                    Text = "Contact",
                    onClick = { /*TODO*/ },
                    Icon = {
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
                    Text = "My Profile",
                    onClick = { /*TODO*/ },
                    Icon = {
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
        }) { innerPadding ->
        Surface(
            modifier = Modifier
                .padding(innerPadding)
                .background(color = Variables.CommonWhite)
        ) {

            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, top = 10.dp, end = 10.dp)
                    .background(color = Variables.bgColor),
                verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
            )
// Search bar

            {
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(
                            8.dp,
                            Alignment.Start
                        ),
                        verticalAlignment = Alignment.CenterVertically,
                    )
                    {
                        OutlinedTextField(modifier = Modifier
                            .shadow(
                                elevation = 0.dp,
                                spotColor = Color(0xFFE0E0E0),
                                ambientColor = Color(0xFFE0E0E0)
                            )

                            .width(316.dp)

                            .background(
                                color = Variables.Grey50,
                                shape = RoundedCornerShape(size = 999.dp)
                            )
                            .padding(start = 12.dp, top = 4.dp, end = 12.dp, bottom = 4.dp),
                            value = "Search for parts",
                            onValueChange = {},
                            shape = RoundedCornerShape(999.dp),
                            leadingIcon = {
                                Image(
                                    modifier = Modifier
                                        .width(35.dp)
                                        .height(34.dp)
                                        .padding(
                                            start = 1.dp,
                                            top = 2.dp,
                                            end = 0.99969.dp,
                                            bottom = 1.09485.dp
                                        ),
                                    painter = painterResource(id = R.drawable.topimg),
                                    contentDescription = ""
                                )
                            },
                            trailingIcon = {
                                Image(
                                    modifier = Modifier
                                        .padding(1.dp)
                                        .width(25.dp)
                                        .height(25.dp),
                                    painter = painterResource(id = R.drawable.mic),
                                    contentDescription = ""
                                )
                            })

                        Image(
                            modifier = Modifier
                                .shadow(
                                    elevation = 6.dp,
                                    spotColor = Color(0x1A101828),
                                    ambientColor = Color(0x1A101828)
                                )
                                .shadow(
                                    elevation = 4.dp,
                                    spotColor = Color(0x1A101828),
                                    ambientColor = Color(0x1A101828)
                                )
                                .border(
                                    width = 1.dp,
                                    color = Variables.CommonWhite,
                                    shape = RoundedCornerShape(size = 999.dp)
                                )
                                .width(50.dp)
                                .height(50.dp)
                                .background(
                                    color = Variables.primary300,
                                    shape = RoundedCornerShape(size = 999.dp)
                                ),
                            painter = painterResource(id = R.drawable.topimg2),
                            contentDescription = ""
                        )

                    }
                }
                // Top main Image

                item {
                    Image(
                        painter = painterResource(id = R.drawable.conimg),
                        contentDescription = ""
                    )
                }
                // Top Categories lazy row
                item {

                    Column(
                        verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                    ) {
                        Row(
                            Modifier
                                .width(398.dp)
                                //  .height(Variables.xxxBig)
                                .padding(
                                    start = Variables.xSm,
                                    top = Variables.xxSm,
                                    end = Variables.xSm,
                                    bottom = Variables.xxSm
                                ),
                            horizontalArrangement = Arrangement.spacedBy(
                                Variables.xSm,
                                Alignment.Start
                            ),
                            verticalAlignment = Alignment.CenterVertically,
                        ) {

                            Text(
                                text = "Top Categories",
                                style = TextStyle(
                                    fontSize = 17.sp,
                                    lineHeight = 24.sp,
                                    fontWeight = FontWeight(600),
                                    color = Variables.textActive,
                                )
                            )
                        }
                        LazyRow(modifier = Modifier.height(146.dp)) {
                            item {

                                CostCard(
                                    onClick = {},
                                    Image = {
                                        Image(
                                            painter = painterResource(id = R.drawable.elip),
                                            contentDescription = ""
                                        )
                                    }, Text = "3D Printing"
                                )

                                CostCard(
                                    onClick = {},
                                    Image = {
                                        Image(
                                            painter = painterResource(id = R.drawable.elip2),
                                            contentDescription = ""
                                        )
                                    }, Text = "Development Boards"
                                )

                                CostCard(
                                    onClick = {},
                                    Image = {
                                        Image(
                                            painter = painterResource(id = R.drawable.elip3),
                                            contentDescription = ""
                                        )
                                    }, Text = "Raspberry Pi"
                                )

                                CostCard(
                                    onClick = {},
                                    Image = {
                                        Image(
                                            painter = painterResource(id = R.drawable.elip),
                                            contentDescription = ""
                                        )
                                    }, Text = "3D Printing"
                                )

                                CostCard(
                                    onClick = {},
                                    Image = {
                                        Image(
                                            painter = painterResource(id = R.drawable.elip2),
                                            contentDescription = ""
                                        )
                                    }, Text = "Development Boards"
                                )

                                CostCard(
                                    onClick = {},
                                    Image = {
                                        Image(
                                            painter = painterResource(id = R.drawable.elip3),
                                            contentDescription = ""
                                        )
                                    }, Text = "Raspberry Pi"
                                )

                            }
                        }


                    }
                }
                item {

                    Column(
                        verticalArrangement = Arrangement.spacedBy(20.dp, Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                    ) {
                        Text(
                            text = "Top Products",
                            style = TextStyle(
                                fontSize = 17.sp,
                                lineHeight = 24.sp,
                                fontWeight = FontWeight(600),
                                color = Variables.textActive,
                            )
                        )
                        LazyRow(
                            Modifier


                        ) {

                            item {
                                Column(
                                    Modifier
                                        .width(224.dp)

                                        .padding(start = 12.dp, end = 12.dp, bottom = 8.dp),
                                    verticalArrangement = Arrangement.spacedBy(
                                        12.dp,
                                        Alignment.Top
                                    ),
                                    horizontalAlignment = Alignment.Start,
                                ) {
                                    Text(
                                        text = "Development Boards",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            lineHeight = 20.sp,
                                            fontWeight = FontWeight(400),
                                            fontStyle = FontStyle.Italic,
                                            color = Variables.textInactive,
                                        )
                                    )
                                    Image(
                                        modifier = Modifier
                                            .width(180.dp)
                                            .height(160.dp),
                                        painter = painterResource(id = R.drawable.stack),
                                        contentDescription = "image description"

                                    )
                                    Text(
                                        text = "Arduino Nano RP2040",

                                        // S1/Regular
                                        style = TextStyle(
                                            fontSize = 16.sp,
                                            lineHeight = 20.sp,
                                            fontWeight = FontWeight(400),
                                            color = Variables.textActive,
                                        )
                                    )
                                    Text(
                                        text = "free delivery",

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
                                        Image(
                                            modifier = Modifier
                                                .width(39.dp)
                                                .height(20.dp),
                                            painter = painterResource(id = R.drawable.badge),
                                            contentDescription = "image description"

                                        )


                                        Text(
                                            text = "1563 reviews",

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
                                Column(
                                    Modifier
                                        .width(224.dp)
                                        .height(384.dp)
                                        .padding(start = 12.dp, end = 12.dp, bottom = 8.dp),
                                    verticalArrangement = Arrangement.spacedBy(
                                        12.dp,
                                        Alignment.Top
                                    ),
                                    horizontalAlignment = Alignment.Start,
                                ) {
                                    Text(
                                        text = "Development Boards",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            lineHeight = 20.sp,
                                            fontWeight = FontWeight(400),
                                            fontStyle = FontStyle.Italic,
                                            color = Variables.textInactive,
                                        )
                                    )
                                    Image(
                                        modifier = Modifier
                                            .width(180.dp)
                                            .height(160.dp),
                                        painter = painterResource(id = R.drawable.raspnew),
                                        contentDescription = "image description"

                                    )
                                    Text(
                                        text = "Raspberry PI 4 Model B With 4GB RAM",
                                        style = TextStyle(
                                            fontSize = 16.sp,
                                            lineHeight = 20.sp,
                                            fontWeight = FontWeight(400),
                                            color = Variables.textActive,
                                        )
                                    )
                                    Text(
                                        text = "free delivery",
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
                                        Image(
                                            modifier = Modifier
                                                .width(39.dp)
                                                .height(20.dp),
                                            painter = painterResource(id = R.drawable.badge),
                                            contentDescription = "image description"

                                        )

                                        Text(
                                            text = "1563 reviews",
                                            style = TextStyle(
                                                fontSize = 12.sp,
                                                lineHeight = 16.sp,
                                                fontWeight = FontWeight(400),
                                                fontStyle = FontStyle.Italic,
                                                color = Variables.textInactive,
                                            )
                                        )
                                    }
                                    Row(
                                        horizontalArrangement = Arrangement.spacedBy(
                                            Variables.xSm,
                                            Alignment.Start
                                        ),
                                        verticalAlignment = Alignment.CenterVertically,
                                    ) {
                                        Text(
                                            text = "₹ 6,400.00",
                                            style = TextStyle(
                                                fontSize = 12.sp,
                                                lineHeight = 16.sp,
                                                fontWeight = FontWeight(400),
                                                color = Variables.textDisabled,
                                                textDecoration = TextDecoration.LineThrough,
                                            )
                                        )
                                        Text(
                                            text = "₹ 5,999.00",
                                            style = TextStyle(
                                                fontSize = 14.sp,
                                                lineHeight = 20.sp,
                                                fontWeight = FontWeight(700),
                                                color = Variables.Green500,
                                            )
                                        )
                                    }

                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

