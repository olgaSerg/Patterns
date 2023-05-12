package com.example.patterns.structural.adapter

class AviPlayer : AdvancedMediaPlayer {
    override fun playAvi(fileName: String?) {
        println("Playing avi file. Name: $fileName")
    }

    override fun playMp4(fileName: String?) {
        //do nothing
    }
}