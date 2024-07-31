package com.example.foodordersystem.model

class Juice(name: String, price: Double) : Drink(name, price) {
    override fun cook(): String {
        return "Exprimiendo el jugo: $name"
    }

    override fun pour(): String {
        return "Vertiendo el jugo: $name"
    }
}

