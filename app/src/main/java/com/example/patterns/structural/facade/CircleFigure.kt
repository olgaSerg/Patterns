package com.example.patterns.structural.facade

import android.util.Log

class CircleFigure : Figure {
    override fun draw() {
        Log.d("!!!Facade", "Circle::draw")
    }
}