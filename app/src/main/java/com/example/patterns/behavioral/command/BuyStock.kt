package com.example.patterns.behavioral.command

class BuyStock(private var abcStock: Stock) : Order {

    override fun execute() {
        abcStock.buy()
    }
}