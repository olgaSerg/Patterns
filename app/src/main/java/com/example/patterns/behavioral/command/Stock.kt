package com.example.patterns.behavioral.command

import android.util.Log

open class Stock {
    private val name = "ABC"
    private val quantity = 10

    fun buy() {
       Log.d("!!!CommandPattern","Stock [ Name: $name, Quantity: $quantity ] bought")
    }
    fun sell(){
        Log.d("!!!CommandPattern","Stock [ Name: $name, Quantity: $quantity ] sold")
    }
}