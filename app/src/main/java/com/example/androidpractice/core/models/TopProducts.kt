package com.example.androidpractice.core.models

import com.example.androidpractice.presentation.components.DynamicImageSource

data class TopProducts(
    val heading: String = "",
    val image: DynamicImageSource,
    val productname: String = "",
    val delivery: String = "",
    val rating: String = "",
    val review: String = "",
    val mrp: String? = null,
    val price: String? = null,
    val stock: String? = null
)