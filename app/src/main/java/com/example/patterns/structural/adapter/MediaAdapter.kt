package com.example.patterns.structural.adapter

class MediaAdapter(audioType: String) : MediaPlayer {
    var advancedMusicPlayer: AdvancedMediaPlayer? = null

    init {
        if (audioType == "avi") {
            advancedMusicPlayer = AviPlayer()
        } else if (audioType == "mp4") {
            advancedMusicPlayer = Mp4Player()
        }
    }

    override fun play(audioType: String, fileName: String) {
        if (audioType == "avi") {
            advancedMusicPlayer?.playAvi(fileName)
        } else if (audioType == "mp4") {
            advancedMusicPlayer?.playMp4(fileName)
        }
    }
}