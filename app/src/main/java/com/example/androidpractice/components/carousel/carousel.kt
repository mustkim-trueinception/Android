package com.example.androidpractice.components.carousel

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androidpractice.R
import com.example.androidpractice.components.Variables
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun Carousel(){
    val image = listOf(
        R.drawable.conimg,
        R.drawable.topimg5,
        R.drawable.topimg4,
        R.drawable.topimg3,
        R.drawable.topimg2,
    )
    Imageslide(image = image)
}

@Composable
fun Imageslide(image:List<Int> )
{
    val pagecount = image.size
    val pagerState = rememberPagerState { pagecount }
    val coroutineScope = rememberCoroutineScope()

    // effect launched for auto image change after 3 seconds
    LaunchedEffect(Unit) {
        while (true){
            delay(3000)
            coroutineScope.launch {
            pagerState.animateScrollToPage((pagerState.currentPage+1)% image.size)
        }
        }
    }
    Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.BottomCenter){
      // Carousel slider
        HorizontalPager(pagerState)
        {
            page -> for (index in 0..image.size){
            Image(modifier = Modifier,
                painter = painterResource(id = image[page]),
                contentDescription = "")
            }
        }
        // indicator

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Center)
        {
            repeat(pagecount){ itration->
                val color = if (pagerState.currentPage == itration) Variables.CommonWhite else Variables.ShadesOfGray400
                Box(modifier = Modifier
                    .padding(2.dp)
                    .size(7.dp)
                    .background(shape = CircleShape, color = color))

            }

        }

    }
}
