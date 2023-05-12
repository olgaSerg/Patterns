package com.example.patterns.structural.adapter

class AudioPlayer : MediaPlayer {
    var mediaAdapter: MediaAdapter? = null
    override fun play(audioType: String, fileName: String) {
         if (audioType== "mp3") {
             println("Playing mp3 file. Name: $fileName")
        } else  {
            mediaAdapter = MediaAdapter(audioType)
            mediaAdapter?.play(audioType, fileName)
        }
    }
}