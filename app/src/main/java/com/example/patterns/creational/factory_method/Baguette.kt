package com.example.patterns.creational.factory_method

class Baguette : BakeryProduct {
    override fun name(): String {
        return "Baguette"
    }

    override fun calories(): String {
        return "280 calories"
    }
}