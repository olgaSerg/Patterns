package com.example.patterns.behavioral.command

class SellStock(private var abcStock: Stock) : Order {

    override fun execute() {
        abcStock.sell()
    }
}