package com.example.patterns.creational.abstract_factory.modern

import com.example.patterns.creational.abstract_factory.interfaces.CoffeeTable

class ModernCoffeeTable : CoffeeTable {
    override fun getName(): String {
        return "Modern coffee table"
    }
}