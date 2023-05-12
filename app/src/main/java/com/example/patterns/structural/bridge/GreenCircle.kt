package com.example.patterns.structural.bridge

import android.util.Log

class GreenCircle : DrawAPI {
    override fun drawCircle(radius: Int, x: Int, y: Int) {
        Log.d("!!BridgePattern","Drawing Circle[ color: green, radius: $radius, x: $x, $y]")
    }
}