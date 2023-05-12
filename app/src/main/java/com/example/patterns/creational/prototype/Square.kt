package com.example.patterns.creational.prototype

import android.util.Log

data class Square(private val id: String, private val type: String) : Shape() {
    override fun draw() {
        Log.d("!!Prototype", "Square draw()")
    }
}