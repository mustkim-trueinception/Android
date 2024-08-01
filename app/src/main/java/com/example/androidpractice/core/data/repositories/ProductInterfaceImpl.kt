package com.example.androidpractice.core.data.repositories

import com.example.androidpractice.R
import com.example.androidpractice.core.models.TopProducts
import com.example.androidpractice.presentation.components.DynamicImageSource

class ProductInterfaceImpl : TopProductInterface {
    override fun getTopProducts(): List<TopProducts> {
        return listOf(
            TopProducts(
                heading = "Devlopment Board",
                image = DynamicImageSource.Local(R.drawable.image_product3),
                productname = "Raspberry PI 4 Model B With 4GB RAM",
                delivery = "freedelivery",
                rating = "4.0",
                review = "1563 reviews",
                mrp = "₹ 6,400.00",
                price = "5,950",
                stock = "avalable"
            ),

            TopProducts(
                heading = "Devlopment Board",
                image = DynamicImageSource.Local(R.drawable.image_product4),
                productname = "Arduino Nano RP2040",
                delivery = "freedelivery",
                rating = "4.4",
                review = "1563 reviews",
                price = "1000",
                stock = "avalable"
            ),
            TopProducts(
                heading = "Devlopment Board",
                image = DynamicImageSource.Local(R.drawable.image_product1),
                productname = "D Printer Extruder 0.5mm nozzle",
                delivery = "freedelivery",
                rating = "5.0",
                review = "1563 reviews",
                stock = "out of stock"

            )
        )
    }
}