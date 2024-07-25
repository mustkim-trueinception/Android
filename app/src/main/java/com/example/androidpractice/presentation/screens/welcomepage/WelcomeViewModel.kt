package com.example.androidpractice.presentation.screens.welcomepage

import androidx.lifecycle.ViewModel
import com.example.androidpractice.core.data.repositories.HelloRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WelcomeViewModel @Inject constructor(
    val helloRepo: HelloRepo

) : ViewModel() {

    fun gethellostring(): String {
        return helloRepo.sayHello()
    }


}