package com.example.prateek.swoosh.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.prateek.swoosh.utilities.LEAGUE_EXTRA
import com.example.prateek.swoosh.R

class SkillActivity : AppCompatActivity() {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(LEAGUE_EXTRA)
        println(league)
    }
}
