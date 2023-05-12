package com.example.patterns.structural.facade

class ShapeMaker {
    private val circle = CircleFigure()
    private val rectangle = RectangleFigure()
    private val square = SquareFigure()

    fun drawCircle() {
        circle.draw()
    }

    fun drawRectangle() {
        rectangle.draw()
    }

    fun drawSquare() {
        square.draw()
    }
}