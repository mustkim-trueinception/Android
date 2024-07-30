package com.example.androidpractice.core.data.repositories

import com.example.androidpractice.R
import com.example.androidpractice.core.models.Categoryitem
import com.example.androidpractice.presentation.components.DynamicImageSource

class CategoryImpl : Category {
    override fun getcategory(): List<Categoryitem> {
        return listOf(
            Categoryitem(
                DynamicImageSource.Local(R.drawable.image_category2),
                description = "3D Printing"
            ),
            Categoryitem(
                DynamicImageSource.Url("https://t3.ftcdn.net/jpg/02/57/16/84/240_F_257168460_AwhicdEIavp7bdCbHXyTaBTHnBoBcZad.jpg"),
                description = "Electronic circuit board close up"
            ),
            Categoryitem(
                DynamicImageSource.Url("https://as1.ftcdn.net/v2/jpg/01/15/55/14/1000_F_115551419_LyyFqSvoZrcqwaOSAUFoYVTKwxxfKeVW.jpg"),
                description = " Electronic Components"
            ),
            Categoryitem(
                DynamicImageSource.Url("https://as1.ftcdn.net/v2/jpg/01/79/80/96/1000_F_179809699_mhT5yDtem2xfEK7sP9jU26Mn8LChEd3q.jpg"),
                description = "Consumer Electronics"
            ),
            Categoryitem(
                DynamicImageSource.Local(R.drawable.image_cat_3),
                description = "3D Printing"
            ),

            )
    }
}