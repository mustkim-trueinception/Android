package com.example.androidpractice.presentation.screens.mainpage

import androidx.lifecycle.ViewModel
import com.example.androidpractice.core.data.repositories.Category
import com.example.androidpractice.core.data.repositories.Imageslist
import com.example.androidpractice.core.data.repositories.TopProductInterface
import com.example.androidpractice.core.models.Categoryitem
import com.example.androidpractice.core.models.TopProducts
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

sealed class TopCategoriesUiState {
    data object Idle : TopCategoriesUiState()
    data class Loading(val process: Float = 0f) : TopCategoriesUiState()
    data class Success(val data: List<Categoryitem>) : TopCategoriesUiState()
    data class Error(val message: String) : TopCategoriesUiState()

}

sealed class TopProductsUiState {
    data object Idle : TopProductsUiState()
    data class Loading(val process: Float = 0f) : TopProductsUiState()
    data class Success(val data: List<TopProducts>) : TopProductsUiState()
    data class Error(val message: String) : TopProductsUiState()

}


@HiltViewModel
class MainViewModel @Inject constructor(
    private val imageslist: Imageslist,
    private val category: Category,
    private val topProducts: TopProductInterface
) : ViewModel() {
    fun getimage(): List<Int> {
        return imageslist.getimages()
    }

    private val _topcategorystate =
        MutableStateFlow<TopCategoriesUiState>(TopCategoriesUiState.Idle)
    val topcategorystate = _topcategorystate.asStateFlow()

    suspend fun getTopCategories() {
        try {
            val getCategory = category.getcategory()
            _topcategorystate.value = TopCategoriesUiState.Success(getCategory)
        } catch (error: Error) {
            _topcategorystate.value = TopCategoriesUiState.Error("Error")
        }

    }

    private val _topproductstate = MutableStateFlow<TopProductsUiState>(TopProductsUiState.Idle)
    val topproductstate = _topproductstate.asStateFlow()

    suspend fun getTopProducts() {
        try {
            val getproducts = topProducts.getTopProducts()
            _topproductstate.value = TopProductsUiState.Success(getproducts)
        } catch (error: Error) {
            _topproductstate.value = TopProductsUiState.Error("Error")
        }
    }
}
