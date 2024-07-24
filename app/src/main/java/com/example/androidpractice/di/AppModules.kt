package com.example.androidpractice.di

import com.example.androidpractice.core.data.repositories.HelloRepo
import com.example.androidpractice.core.data.repositories.HelloRepoImpl
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



}