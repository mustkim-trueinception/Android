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
import androidx.compose.foundation.lazy.LazyRow
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.androidpractice.R
import com.example.androidpractice.components.CostCard
import com.example.androidpractice.components.Variables


@Composable
fun mainpage(navController: NavController) {

    Scaffold(

        bottomBar = {
            NavigationBar {
                IconButton( modifier = Modifier.weight(1f),onClick = {}) {
                    Image(
                        modifier = Modifier.weight(1f),
                        painter = painterResource(id = R.drawable.home),
                        contentDescription = ""
                    )
                }
                IconButton( modifier = Modifier.weight(1f),onClick = {}) {
                    Image(
                        modifier = Modifier.weight(1f),
                        painter = painterResource(id = R.drawable.offer),
                        contentDescription = ""
                    )
                }
                IconButton( modifier = Modifier.weight(1f),onClick = {}) {
                    Image(
                        modifier = Modifier.weight(1f),
                        painter = painterResource(id = R.drawable.cate),
                        contentDescription = ""
                    )
                }
                IconButton( modifier = Modifier.weight(1f),onClick = {}) {
                    Image(
                        modifier = Modifier.weight(1f),
                        painter = painterResource(id = R.drawable.contact),
                        contentDescription = ""
                    )
                }
                IconButton( modifier = Modifier.weight(1f),onClick = {}) {
                    Image(
                        modifier = Modifier.weight(1f),
                        painter = painterResource(id = R.drawable.pro),
                        contentDescription = ""
                    )
                }


            }
        }) { innerPadding ->
        Surface(
            modifier = Modifier
                .padding(innerPadding)
                .background(color = Variables.CommonWhite)
        ) {


            Column(
                modifier = Modifier
                    .padding(10.dp)
                    .background(color = Variables.bgColor),
                verticalArrangement = Arrangement.spacedBy(Variables.xxxBig, Alignment.Top)

            )

            {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(
                        8.dp,
                        Alignment.CenterHorizontally
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
                        .width(318.dp)

                        .background(
                            color = Variables.Grey50,
                            shape = RoundedCornerShape(size = 999.dp)
                        )
                        .padding(start = 12.dp, top = 4.dp, end = 12.dp, bottom = 4.dp),
                        value = "SEARCH HERE",
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
                                    .width(30.dp)
                                    .height(30.dp),
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
                            .width(55.dp)
                            .height(55.dp)
                            .background(
                                color = Variables.primary300,
                                shape = RoundedCornerShape(size = 999.dp)
                            )
                    ,
                        painter = painterResource(id = R.drawable.topimg2),
                        contentDescription = ""
                    )

                }
                Image(painter = painterResource(id = R.drawable.conimg), contentDescription = "")

                Column(
                    verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                ) {
                    Row(
                        Modifier
                            .width(398.dp)
                            .height(Variables.xxxBig)
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
                                Image = {
                                    Image(
                                        painter = painterResource(id = R.drawable.elip),
                                        contentDescription = ""
                                    )
                                }, Text = "3D Printing"
                            )

                            CostCard(
                                Image = {
                                    Image(
                                        painter = painterResource(id = R.drawable.elip2),
                                        contentDescription = ""
                                    )
                                }, Text = "Development Boards"
                            )

                            CostCard(
                                Image = {
                                    Image(
                                        painter = painterResource(id = R.drawable.elip3),
                                        contentDescription = ""
                                    )
                                }, Text = "Raspberry Pi"
                            )

                            CostCard(
                                Image = {
                                    Image(
                                        painter = painterResource(id = R.drawable.elip),
                                        contentDescription = ""
                                    )
                                }, Text = "3D Printing"
                            )

                            CostCard(
                                Image = {
                                    Image(
                                        painter = painterResource(id = R.drawable.elip2),
                                        contentDescription = ""
                                    )
                                }, Text = "Development Boards"
                            )

                            CostCard(
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

                Column(
                    verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.Top),
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
                            .width(224.dp)
                            .height(384.dp)
                            .padding(start = 12.dp, top = 8.dp, end = 12.dp, bottom = 8.dp)
                    ) {

                    }
                }
            }
        }
    }
}
