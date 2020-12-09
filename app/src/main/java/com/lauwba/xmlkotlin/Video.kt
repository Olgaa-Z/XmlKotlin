package com.lauwba.xmlkotlin

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.widget.Button
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView

class Video : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

//        val videoView = findViewById<VideoView>(R.id.videoView)
//        //Creating MediaController
//        val mediaController = MediaController(this)
//        mediaController.setAnchorView(videoView)
//        //specify the location of media file
//        val uri: Uri = Uri.parse(Environment.getExternalStorageDirectory().getPath() + "/movies/cinematic.mp4")
//        //Setting MediaController and URI, then starting the videoView
//        videoView.setMediaController(mediaController)
//        videoView.setVideoURI(uri)
//        videoView.requestFocus()
//        videoView.start()

        val videoView = findViewById<VideoView>(R.id.videoView)
        val path = "android.resource://" + packageName + "/" + R.raw.cinematic
        videoView?.setVideoURI(Uri.parse(path))

        val button = findViewById<Button>(R.id.button)
        button?.setOnClickListener({
            val isPlaying = videoView.isPlaying
            button.setText(if (isPlaying) R.string.play else R.string.pause)

            val msg = getString(if (isPlaying) R.string.paused else R.string.playing)
            Toast.makeText(this@Video, msg, Toast.LENGTH_SHORT).show()
            if (isPlaying) {
                videoView.pause()
            } else {
                videoView.start()
            }
        })


    }
}