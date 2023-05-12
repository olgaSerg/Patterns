package com.example.patterns.structural.decorator

import android.util.Log

class RedShapeDecorator(decoratedShape: ShapeInterface) :
    ShapeDecorator(decoratedShape) {
    override fun draw() {
        decoratedShape.draw()
        setRedBorder(decoratedShape)
    }

    private fun setRedBorder(decoratedShape: ShapeInterface) {
        Log.d("!!!DecoratorRedShape", "Red ${decoratedShape.getShapeName()}")
    }
}