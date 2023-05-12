package com.example.patterns.behavioral.mediator

import android.util.Log
import java.util.Date

class ChatRoom {

    companion object {
        fun showMessage(user: User, message: String) {
            Log.d("!!!MediatorPattern", Date().toString() + " [" + user.name + "] : " + message)
        }
    }
}