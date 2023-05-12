package com.example.patterns.creational.prototype

import android.util.Log

data class Rectangle(private val id: String, private val type: String) : Shape() {
    override fun draw() {
        Log.d("!!Prototype", "Rectangle draw()")
    }
}