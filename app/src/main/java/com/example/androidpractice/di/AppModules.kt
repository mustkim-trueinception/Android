package com.example.androidpractice.di

import com.example.androidpractice.core.data.repositories.Category
import com.example.androidpractice.core.data.repositories.CategoryImpl
import com.example.androidpractice.core.data.repositories.HelloRepo
import com.example.androidpractice.core.data.repositories.HelloRepoImpl
import com.example.androidpractice.core.data.repositories.Imageslist
import com.example.androidpractice.core.data.repositories.ImageslistImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModules {

    @Singleton
    @Provides
    fun provideHelloRepo(): HelloRepo {
        return HelloRepoImpl()
    }
    @Singleton
    @Provides
    fun provideImageslist(): Imageslist {
        return ImageslistImpl()
    }

    @Singleton
    @Provides
    fun providescategory(): Category {
        return CategoryImpl()
    }



}