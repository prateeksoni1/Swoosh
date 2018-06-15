package com.example.prateek.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class leagueActivity : AppCompatActivity() {

    var leagueSelected = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)


    }

    fun onMensBtnClicked (view: View) {

        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        leagueSelected = "mens"
    }

    fun onWomensBtnClicked (view: View) {

        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        leagueSelected = "womens"

    }

    fun onCoedBtnClicked  (view: View) {

        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = true
        leagueSelected = "coed"

    }

    fun nextBtnClicked(view: View) {

        if(leagueSelected == "") {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        } else {
            val skillActivity = Intent(this, SkillActivity::class.java)
            startActivity(skillActivity)
        }

    }
}
