package com.example.foodordersystem.model

abstract class Food(val name: String, val price: Double) {
    abstract fun cook(): String
}

