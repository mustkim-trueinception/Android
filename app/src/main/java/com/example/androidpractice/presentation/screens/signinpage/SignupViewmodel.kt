package com.example.androidpractice.presentation.screens.signinpage

import androidx.lifecycle.ViewModel
import com.example.androidpractice.core.data.repositories.Imageslist
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SignupViewmodel @Inject constructor(
    val Imagelist: Imageslist
) : ViewModel() {

    fun Getimage(): List<Int> {
        return Imagelist.getimages()
    }
}