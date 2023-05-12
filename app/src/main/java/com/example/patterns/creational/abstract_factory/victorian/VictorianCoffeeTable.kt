package com.example.patterns.creational.abstract_factory.victorian

import com.example.patterns.creational.abstract_factory.interfaces.CoffeeTable

class VictorianCoffeeTable : CoffeeTable {
    override fun getName(): String {
        return "Victorian coffee table"
    }
}