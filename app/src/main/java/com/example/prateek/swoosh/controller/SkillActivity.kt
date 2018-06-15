package com.example.prateek.swoosh.controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.prateek.swoosh.utilities.LEAGUE_EXTRA
import com.example.prateek.swoosh.R
import com.example.prateek.swoosh.utilities.SKILL_EXTRA
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)



        league = intent.getStringExtra(LEAGUE_EXTRA)
        println(league)

        finishBtn.setOnClickListener() {

            if(skill != "") {
                val finishIntent = Intent(this, finishActivity::class.java)
                finishIntent.putExtra(LEAGUE_EXTRA, league)
                finishIntent.putExtra(SKILL_EXTRA, skill)
                startActivity(finishIntent)
            } else {
                Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
            }

        }
    }


    fun onBeginnerBtnClicked(view: View) {
        ballerSkillBtn.isChecked = false
        skill = "beginner"
    }

    fun onBallerBtnClicked(view: View) {
        beginnerSkillBtn.isChecked = false
        skill = "baller"
    }
}
