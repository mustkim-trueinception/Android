package com.example.androidpractice.core.models

import com.example.androidpractice.presentation.components.DynamicImageSource

data class TopProducts(
    val lable: String = "",
    val image: DynamicImageSource,
    val name: String = "",
    val delivery: String = "",
    val rating: String = "",
    val review: String = "",
    val mrp: String = "",
    val price: String = "",
    val stock: String = ""
)