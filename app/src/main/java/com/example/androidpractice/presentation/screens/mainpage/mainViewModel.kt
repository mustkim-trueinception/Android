package com.example.androidpractice.presentation.screens.mainpage

import androidx.lifecycle.ViewModel
import com.example.androidpractice.core.data.repositories.Imageslist
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class mainViewModel @Inject constructor(
    val Imageslist: Imageslist
) : ViewModel() {

    fun Getimage(): List<Int> {
        return Imageslist.getimages()
    }
}
