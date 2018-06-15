package com.example.prateek.swoosh.controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.prateek.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

class welcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        getstartedbtn.setOnClickListener {
            val leagueIntent = Intent(this, leagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
