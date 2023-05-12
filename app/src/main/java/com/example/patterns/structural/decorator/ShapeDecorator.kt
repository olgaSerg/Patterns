package com.example.patterns.structural.decorator

abstract class ShapeDecorator(val decoratedShape: ShapeInterface) :
    ShapeInterface {

    override fun draw() {
        decoratedShape.draw()
    }

    override fun getShapeName(): String {
       return decoratedShape.getShapeName()
    }
}