package com.example.patterns.structural.facade

import android.util.Log

class SquareFigure : Figure {
    override fun draw() {
        Log.d("!!!Facade", "Square::draw")
    }
}