package com.example.androidpractice.presentation.screens.mainpage

import androidx.lifecycle.ViewModel
import com.example.androidpractice.core.data.repositories.Category
import com.example.androidpractice.core.data.repositories.Imageslist
import com.example.androidpractice.core.models.Categoryitem
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val imageslist: Imageslist,
    private val category: Category
) : ViewModel() {

    fun getimage(): List<Int> {
        return imageslist.getimages()
    }
    fun getcategory(): List<Categoryitem> {
        return category.getcategory()
    }

}
