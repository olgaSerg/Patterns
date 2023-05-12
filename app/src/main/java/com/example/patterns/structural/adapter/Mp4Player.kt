package com.example.patterns.structural.adapter

import android.util.Log

class Mp4Player : AdvancedMediaPlayer {
    override fun playAvi(fileName: String?) {
//        do nothing
    }

    override fun playMp4(fileName: String?) {
        Log.d("!!AdapterPattern", "Playing mp4 file. Name: $fileName")
    }
}