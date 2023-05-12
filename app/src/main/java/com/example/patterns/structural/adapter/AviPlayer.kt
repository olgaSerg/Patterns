package com.example.patterns.structural.adapter

import android.util.Log

class AviPlayer : AdvancedMediaPlayer {
    override fun playAvi(fileName: String?) {
        Log.d("!!AdapterPattern", "Playing avi file. Name: $fileName")
    }

    override fun playMp4(fileName: String?) {
        //do nothing
    }
}