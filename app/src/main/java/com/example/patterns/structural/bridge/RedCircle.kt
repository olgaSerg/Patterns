package com.example.patterns.structural.bridge

import android.util.Log

class RedCircle : DrawAPI {
    override fun drawCircle(radius: Int, x: Int, y: Int) {
        Log.d("!!BridgePattern","Drawing Circle[ color: red, radius: $radius, x: $x, $y]")
    }
}