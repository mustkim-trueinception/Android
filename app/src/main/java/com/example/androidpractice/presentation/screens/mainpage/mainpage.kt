package com.example.androidpractice.presentation.screens.mainpage

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.androidpractice.R
import com.example.androidpractice.presentation.components.CostCard
import com.example.androidpractice.presentation.components.CostomBadge
import com.example.androidpractice.presentation.components.TopCategories
import com.example.androidpractice.presentation.components.Variables
import com.example.androidpractice.presentation.components.bottomnavbar.Navbar
import com.example.androidpractice.presentation.components.carousel.Carousel


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun Mainpage(mainViewModel: MainViewModel = hiltViewModel()) {
    Scaffold(
        bottomBar = {
            NavigationBar(
                containerColor = Variables.bgColor,
                contentColor = Variables.bgColor,
            ) {
                Navbar()
            }
        }
    ) { innerPadding ->
        Surface(
            modifier = Modifier
                .padding(innerPadding)
                .background(color = Variables.primary500)
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp)
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
                            12.dp,
                            alignment = Alignment.CenterHorizontally
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
                            .weight(1f)
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
                                IconButton(onClick = {}) {
                                    Image(
                                        modifier = Modifier
                                            .padding(1.dp)
                                            .width(25.dp)
                                            .height(25.dp),
                                        painter = painterResource(id = R.drawable.mic),
                                        contentDescription = ""
                                    )

                                }

                            })

                        IconButton(modifier = Modifier.size(50.dp), onClick = {}) {
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
                                painter = painterResource(id = R.drawable.topbarimg2),
                                contentDescription = ""
                            )
                        }
                    }
                }
                // Carousel Slider Image
                item {
                    Carousel(mainViewModel.getimage())
                }
                // Top Categories lazy row
                item {
                    Column(
                        modifier = Modifier,
                        verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                    ) {
                        Row(
                            Modifier
                                .fillMaxWidth()
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
                            Column(
                                verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
                                horizontalAlignment = Alignment.Start,
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
                                Row(
                                    Modifier
                                        .background(color = Color(0xFF9E9E9E))
                                        .fillMaxWidth()
                                        .height(1.dp)
                                        .padding(
                                            start = Variables.xSm,
                                            top = Variables.xxSm,
                                            end = Variables.xSm,
                                            bottom = Variables.xxSm
                                        )
                                ) {

                                }
                            }
                        }
                        LazyRow(
                            modifier = Modifier.height(146.dp)
                        )
                        {
                            items(mainViewModel.getcategory()) { Categoryitem ->

                                CostCard(img = Categoryitem.image, text = Categoryitem.description)



                            }

//                            item {
//                                CostCard(
//                                    image = {
//                                        Image(
//                                            painter = painterResource(id = R.drawable.elip),
//                                            contentDescription = ""
//                                        )
//                                    }, text = "3D Printing"
//                                )
//                                CostCard(
//                                    image = {
//                                        Image(
//                                            painter = painterResource(id = R.drawable.elip2),
//                                            contentDescription = ""
//                                        )
//                                    }, text = "Development Boards"
//                                )
//                                CostCard(
//                                    image = {
//                                        Image(
//                                            painter = painterResource(id = R.drawable.elip3),
//                                            contentDescription = ""
//                                        )
//                                    }, text = "Raspberry Pi"
//                                )
//
//                                CostCard(
//                                    image = {
//                                        Image(
//                                            painter = painterResource(id = R.drawable.categeries4),
//                                            contentDescription = ""
//                                        )
//                                    }, text = "Wires & Cables"
//                                )
//
//                                CostCard(
//
//                                    image = {
//                                        Image(
//                                            painter = painterResource(id = R.drawable.elip2),
//                                            contentDescription = ""
//                                        )
//                                    }, text = "Development Boards"
//                                )
//
//                                CostCard(
//                                    image = {
//                                        Image(
//                                            painter = painterResource(id = R.drawable.elip3),
//                                            contentDescription = ""
//                                        )
//                                    }, text = "Raspberry Pi"
//                                )
//
//                            }
                        }
                    }
                }
                item {

                    Column(
                        verticalArrangement = Arrangement.spacedBy(20.dp, Alignment.Top),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Column(
                            modifier = Modifier.padding(start = 8.dp),
                            verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
                            horizontalAlignment = Alignment.Start
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
                            Row(
                                Modifier
                                    .background(color = Color(0xFF9E9E9E))
                                    .fillMaxWidth()
                                    .height(1.dp)
                                    .padding(
                                        start = Variables.xSm,
                                        top = Variables.xxSm,
                                        end = Variables.xSm,
                                        bottom = Variables.xxSm
                                    )
                            ) {
                            }
                        }
                        LazyRow(
                            Modifier
                        ) {
                            item {
                                TopCategories(
                                    productname = "Raspberry PI 4 Model B With 4GB RAM",
                                    image = {
                                        Image(
                                            modifier = Modifier
                                                .width(180.dp)
                                                .height(160.dp),
                                            painter = painterResource(id = R.drawable.raspnew),
                                            contentDescription = "image description"
                                        )
                                    },
                                    badge = { CostomBadge(rating = 4.0) },
                                    mrp = "₹ 6,400.00",
                                    price = "5,950"
                                )


                                TopCategories(
                                    productname = "Arduino Nano RP2040",
                                    badge = { CostomBadge(rating = 5.0) },
                                    image = {
                                        Image(
                                            modifier = Modifier
                                                .width(180.dp)
                                                .height(160.dp),
                                            painter = painterResource(id = R.drawable.stack),
                                            contentDescription = "image description"
                                        )
                                    })

                                TopCategories(
                                    productname = "3D Printer Extruder 0.5mm nozzle",
                                    image = {
                                        Image(
                                            modifier = Modifier
                                                .width(180.dp)
                                                .height(160.dp),
                                            painter = painterResource(id = R.drawable.product3),
                                            contentDescription = "image description"
                                        )
                                    },
                                    badge = { CostomBadge(rating = 4.8) },
                                    price = "5,440.00"
                                )
                            }
                        }
                    }
                }

            }
        }
    }
}
