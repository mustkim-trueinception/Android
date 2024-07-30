package com.example.androidpractice.core.data.repositories

import com.example.androidpractice.core.models.Categoryitem

interface Category {
   fun getcategory(): List<Categoryitem>
}