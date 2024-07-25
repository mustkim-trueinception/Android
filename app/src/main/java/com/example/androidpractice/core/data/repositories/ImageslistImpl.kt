package com.example.androidpractice.core.data.repositories

import com.example.androidpractice.R

class ImageslistImpl : Imageslist {
    override fun getimages(): List<Int> {
        return listOf(
            R.drawable.topimg1,
            R.drawable.topimg2,
            R.drawable.topimg3,
            R.drawable.topimg4,
            R.drawable.topimg5
        )
    }
}