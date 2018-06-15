package com.example.prateek.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SkillActivity : AppCompatActivity() {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(LEAGUE_EXTRA)
        println(league)
    }
}
