package com.example.patterns.creational.abstract_factory

import com.example.patterns.creational.abstract_factory.interfaces.Chair
import com.example.patterns.creational.abstract_factory.interfaces.CoffeeTable
import com.example.patterns.creational.abstract_factory.interfaces.Sofa

interface AbstractFactory {

    companion object {
        fun getFactory(id: Int): AbstractFactory {
            return when(id) {
                1 -> VictorianFurnitureFactory()
                2 -> ModernFurnitureFactory()
                else -> throw IllegalArgumentException("value: $id is not available")
            }
        }
    }

    fun createChair() : Chair

    fun createCoffeeTable(): CoffeeTable

    fun createSofa(): Sofa
}