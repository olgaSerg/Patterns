package com.example.patterns.structural.decorator

import android.util.Log

class CircleDecorator(val name: String) : ShapeInterface {
    override fun draw() {
        Log.d("!!!DecoratorDraw", "Shape: $name")
    }

    override fun getShapeName(): String {
        return name
    }
}