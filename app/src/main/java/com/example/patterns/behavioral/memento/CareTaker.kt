package com.example.patterns.behavioral.memento

class CareTaker {
    private val mementoList: MutableList<Memento> = ArrayList()

    fun add(state: Memento) {
        mementoList.add(state)
    }

    operator fun get(index: Int): Memento {
        return mementoList[index]
    }
}