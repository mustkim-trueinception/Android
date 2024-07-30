package com.example.androidpractice.presentation.screens.mainpage

import androidx.lifecycle.ViewModel
import com.example.androidpractice.core.data.repositories.Category
import com.example.androidpractice.core.data.repositories.Imageslist
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val imageslist: Imageslist,
    val category: Category
) : ViewModel() {

    fun getimage(): List<Int> {
        return imageslist.getimages()
    }

    var topcat = MutableStateFlow(category.getcategory())
        private set
}
