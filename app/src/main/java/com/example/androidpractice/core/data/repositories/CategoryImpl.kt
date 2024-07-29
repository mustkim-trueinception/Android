package com.example.androidpractice.core.data.repositories

import com.example.androidpractice.R
import com.example.androidpractice.core.models.Categoryitem
import com.example.androidpractice.presentation.components.DynamicImageSource

class CategoryImpl : Category {
    override fun getcategory(): List<Categoryitem> {
        return listOf(
            Categoryitem(image = DynamicImageSource.Local(R.drawable.topimg1), description = ""),
            Categoryitem(image = DynamicImageSource.Local(R.drawable.topimg1), description = ""),
            Categoryitem(image = DynamicImageSource.Local(R.drawable.topimg1), description = ""),
            Categoryitem(image = DynamicImageSource.Local(R.drawable.topimg1), description = ""),
            Categoryitem(image = DynamicImageSource.Local(R.drawable.topimg1), description = ""),
            Categoryitem(image = DynamicImageSource.Local(R.drawable.topimg1), description = "")

        )
    }
}