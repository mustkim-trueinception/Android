package com.example.androidpractice.core.data.repositories

class HelloRepoImpl : HelloRepo{
    override fun sayHello(): String {
        return "Hey, Hello \uD83D\uDC4B\uD83C\uDFFB"
    }
}