package com.example.patterns.structural.adapter

import android.util.Log

class AudioPlayer : MediaPlayer {
    var mediaAdapter: MediaAdapter? = null
    override fun play(audioType: String, fileName: String) {
         if (audioType== "mp3") {
             Log.d("!!AdapterPattern","Playing mp3 file. Name: $fileName")
        } else  {
            mediaAdapter = MediaAdapter(audioType)
            mediaAdapter?.play(audioType, fileName)
        }
    }
}