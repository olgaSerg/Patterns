package com.example.patterns.creational.factory_method

class Pie : BakeryProduct {
    override fun name(): String {
        return "Pie"
    }

    override fun calories(): String {
        return "300 calories"
    }
}