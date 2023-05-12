package com.example.patterns.creational.abstract_factory.modern

import com.example.patterns.creational.abstract_factory.interfaces.Chair

class ModernChair: Chair {
    override fun getName(): String {
        return "Modern chair"
    }
}