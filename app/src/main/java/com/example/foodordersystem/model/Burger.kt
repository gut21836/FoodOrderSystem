package com.example.foodordersystem.model

class Burger(name: String, price: Double) : Food(name, price) {
    override fun cook(): String {
        return "Asando la hamburguesa: $name"
    }
}