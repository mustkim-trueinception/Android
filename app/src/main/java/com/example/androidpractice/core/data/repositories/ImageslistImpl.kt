package com.example.androidpractice.core.data.repositories

import com.example.androidpractice.R

class ImageslistImpl : Imageslist {
    override fun getimages(): List<Int> {
        return listOf(
            R.drawable.image_banner1,
            R.drawable.image_banner2,
            R.drawable.image_banner3,
            R.drawable.image_banner4,
            R.drawable.image_banner5,

        )
    }
}