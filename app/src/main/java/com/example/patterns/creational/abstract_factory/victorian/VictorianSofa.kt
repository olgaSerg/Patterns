package com.example.patterns.creational.abstract_factory.victorian

import com.example.patterns.creational.abstract_factory.interfaces.Sofa

class VictorianSofa: Sofa {
    override fun getName(): String {
        return "Victorian sofa"
    }
}