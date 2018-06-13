package com.example.prateek.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
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
