package com.example.foodordersystem.model

fun Food.discountedPrice(discountPercentage: Double): Double {
    return price * (1 - discountPercentage / 100)
}

