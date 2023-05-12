package com.example.patterns.creational.prototype

abstract class Shape : Cloneable {

    abstract fun draw()

    fun cloneObject(): Any? {
        var clone: Any? = null
        try {
            clone = super.clone()
        } catch (e: CloneNotSupportedException) {
            e.printStackTrace()
        }
        return clone
    }
}