package com.example.patterns.creational.abstract_factory

import com.example.patterns.creational.abstract_factory.interfaces.Chair
import com.example.patterns.creational.abstract_factory.interfaces.CoffeeTable
import com.example.patterns.creational.abstract_factory.interfaces.Sofa
import com.example.patterns.creational.abstract_factory.modern.ModernChair
import com.example.patterns.creational.abstract_factory.modern.ModernCoffeeTable
import com.example.patterns.creational.abstract_factory.modern.ModernSofa

class ModernFurnitureFactory : AbstractFactory {
    override fun createChair(): Chair {
        return ModernChair()
    }

    override fun createCoffeeTable(): CoffeeTable {
        return ModernCoffeeTable()
    }

    override fun createSofa(): Sofa {
        return ModernSofa()
    }
}