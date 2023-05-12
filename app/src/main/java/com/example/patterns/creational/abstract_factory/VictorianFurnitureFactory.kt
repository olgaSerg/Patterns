package com.example.patterns.creational.abstract_factory

import com.example.patterns.creational.abstract_factory.interfaces.Chair
import com.example.patterns.creational.abstract_factory.interfaces.CoffeeTable
import com.example.patterns.creational.abstract_factory.interfaces.Sofa
import com.example.patterns.creational.abstract_factory.victorian.VictorianChair
import com.example.patterns.creational.abstract_factory.victorian.VictorianCoffeeTable
import com.example.patterns.creational.abstract_factory.victorian.VictorianSofa

class VictorianFurnitureFactory : AbstractFactory {
    override fun createChair(): Chair {
        return VictorianChair()
    }

    override fun createCoffeeTable(): CoffeeTable {
        return VictorianCoffeeTable()
    }

    override fun createSofa(): Sofa {
        return VictorianSofa()
    }
}