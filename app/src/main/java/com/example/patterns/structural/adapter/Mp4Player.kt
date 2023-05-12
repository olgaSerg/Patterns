package com.example.patterns.structural.adapter

class Mp4Player : AdvancedMediaPlayer {
    override fun playAvi(fileName: String?) {
//        do nothing
    }

    override fun playMp4(fileName: String?) {
        println("Playing mp4 file. Name: $fileName")
    }
}