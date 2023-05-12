package com.example.patterns.structural.facade

import android.util.Log

class RectangleFigure : Figure {
    override fun draw() {
        Log.d("!!!Facade", "Rectangle::draw")
    }
}