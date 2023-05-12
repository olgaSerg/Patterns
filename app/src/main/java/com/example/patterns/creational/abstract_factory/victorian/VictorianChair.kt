package com.example.patterns.creational.abstract_factory.victorian

import com.example.patterns.creational.abstract_factory.interfaces.Chair

class VictorianChair : Chair {
    override fun getName(): String {
        return "Victorian chair"
    }
}