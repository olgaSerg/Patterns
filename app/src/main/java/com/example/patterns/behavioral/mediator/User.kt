package com.example.patterns.behavioral.mediator

class User(var name: String) {

    fun sendMessage(message: String) {
        ChatRoom.showMessage(this, message)
    }
}