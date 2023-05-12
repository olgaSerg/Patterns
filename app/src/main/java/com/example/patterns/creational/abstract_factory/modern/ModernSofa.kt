package com.example.patterns.creational.abstract_factory.modern

import com.example.patterns.creational.abstract_factory.interfaces.Sofa

class ModernSofa : Sofa {
    override fun getName(): String {
        return "Modern sofa"
    }
}