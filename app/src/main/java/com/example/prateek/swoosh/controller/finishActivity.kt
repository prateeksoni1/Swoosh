package com.example.prateek.swoosh.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.prateek.swoosh.R
import com.example.prateek.swoosh.utilities.LEAGUE_EXTRA
import com.example.prateek.swoosh.utilities.SKILL_EXTRA
import kotlinx.android.synthetic.main.activity_finish.*

class finishActivity : AppCompatActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        league = intent.getStringExtra(LEAGUE_EXTRA)
        skill = intent.getStringExtra(SKILL_EXTRA)

        finishTxt.text = "Looking for $league $skill league near you..."
    }
}
