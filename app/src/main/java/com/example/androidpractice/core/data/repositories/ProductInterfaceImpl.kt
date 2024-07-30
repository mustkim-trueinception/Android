package com.example.androidpractice.core.data.repositories

import com.example.androidpractice.R
import com.example.androidpractice.core.models.TopProducts
import com.example.androidpractice.presentation.components.DynamicImageSource

class ProductInterfaceImpl : TopProductInterface {
    override fun getTopProducts(): List<TopProducts> {
        return listOf(
            TopProducts(
                "1stprodict",
                image = DynamicImageSource.Local(R.drawable.image_product3),
                "product1",
                "freedelivery",
                "5.0",
                "1500",
                "2000",
                "1000",
                "avalable"
            ),

            TopProducts(
                "1stprodict",
                image = DynamicImageSource.Local(R.drawable.image_product3),
                "product1",
                "freedelivery",
                "5.0",
                "1500",
                "2000",
                "1000",
                "avalable"
            )
        )
    }
}