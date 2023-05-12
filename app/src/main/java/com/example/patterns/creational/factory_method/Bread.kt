package com.example.patterns.creational.factory_method

class Bread : BakeryProduct {
    override fun name(): String {
        return "Bread"
    }

    override fun calories(): String {
        return "100 calories"
    }
}