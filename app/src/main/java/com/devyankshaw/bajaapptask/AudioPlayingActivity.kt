package com.devyankshaw.bajaapptask

import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_audio_playing.*


class AudioPlayingActivity : SwipeDismissBaseActivity(), View.OnClickListener {

    var player: MediaPlayer = MediaPlayer()
    var seekHandler: Handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio_playing)
        getInit()
        seekUpdation()
        player.start()
        text_shown.text = "Playing..."
    }

    private fun getInit() {
        play_button.setOnClickListener(this)
        pause_button.setOnClickListener(this)
        player = MediaPlayer.create(
            this,
            R.raw.audio
        )
        seek_bar.max = player.duration
    }

    var run:Runnable = Runnable { seekUpdation() }

    private fun seekUpdation() {
        seek_bar.progress = player.currentPosition
        seekHandler.postDelayed(
            run,
            1000
        )
    }
    override fun onClick(view:View) {
        when (view.id) {
            R.id.play_button -> {
                text_shown.text = "Playing..."
                player.start()
            }
            R.id.pause_button -> {
                player.pause()
                text_shown.text = "Paused..."
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        player.pause()
    }

}