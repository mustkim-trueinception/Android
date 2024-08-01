package com.example.androidpractice.core.data.repositories

import com.example.androidpractice.core.models.TopProducts

interface TopProductInterface {
    fun getTopProducts(): List<TopProducts>
}