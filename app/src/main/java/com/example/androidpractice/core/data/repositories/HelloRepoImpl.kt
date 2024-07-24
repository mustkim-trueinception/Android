package com.example.androidpractice.core.data.repositories

class HelloRepoImpl : HelloRepo{
    override fun sayHello(): String {
        return "hello from hellorepo"
    }
}