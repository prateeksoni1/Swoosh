package com.example.prateek.swoosh.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.prateek.swoosh.R
import com.example.prateek.swoosh.model.Player
import com.example.prateek.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class finishActivity : AppCompatActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        player = intent.getParcelableExtra(EXTRA_PLAYER)

        finishTxt.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}
