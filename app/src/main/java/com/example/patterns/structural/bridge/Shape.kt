package com.example.patterns.structural.bridge

abstract class Shape(var drawAPI: DrawAPI) {

    abstract fun draw()
}