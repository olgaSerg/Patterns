package com.example.patterns.behavioral.memento

class Creator {

    var state: String? = null

    fun setNewState(newState: String?) {
        state = newState
    }

    fun saveStateToMemento(): Memento {
        return Memento(state)
    }

    fun getStateFromMemento(memento: Memento) {
        state = memento.state
    }
}