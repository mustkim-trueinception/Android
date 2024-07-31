package com.example.androidpractice.core.data.repositories

import com.example.androidpractice.R
import com.example.androidpractice.core.models.TopProducts
import com.example.androidpractice.presentation.components.DynamicImageSource

class ProductInterfaceImpl : TopProductInterface {
    override fun getTopProducts(): List<TopProducts> {
        return listOf(
            TopProducts(
                "Devlopment Board",
                image = DynamicImageSource.Local(R.drawable.image_product3),
                "Raspberry PI 4 Model B With 4GB RAM",
                "freedelivery",
                "4.0",
                "1563 reviews",
                "₹ 6,400.00",
                "5,950",
                "avalable"
            ),

            TopProducts(
                "Devlopment Board",
                image = DynamicImageSource.Local(R.drawable.image_product4),
                "Arduino Nano RP2040",
                "freedelivery",
                "4.4",
                "1563 reviews",
                "2000",
                "1000",
                "avalable"
            ),
            TopProducts(
                "Devlopment Board",
                image = DynamicImageSource.Local(R.drawable.image_product1),
                "D Printer Extruder 0.5mm nozzle",
                "freedelivery",
                "5.0",
                "1563 reviews",
                "₹ 6,400.00",
                "5,950",
                "Out of stock"

            )
        )
    }
}