package com.example.foodordersystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.foodordersystem.model.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val burger = Burger("Cheeseburger", 5.99)
        val pizza = Pizza("Pepperoni Pizza", 8.99)
        val iceCream = IceCream("Vanilla Ice Cream", 3.99)
        val juice = Juice("Orange Juice", 2.99)

        Log.d("FoodOrderSystem", burger.cook())
        Log.d("FoodOrderSystem", pizza.cook())
        Log.d("FoodOrderSystem", iceCream.cook())
        Log.d("FoodOrderSystem", juice.cook())
        Log.d("FoodOrderSystem", juice.pour())
        Log.d("FoodOrderSystem", iceCream.eat())

        val discountedBurgerPrice = burger.discountedPrice(10.0)
        Log.d("FoodOrderSystem", "Precio con descuento de la hamburguesa: $discountedBurgerPrice")
    }
}
