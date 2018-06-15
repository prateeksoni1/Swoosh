package com.example.prateek.swoosh.controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.prateek.swoosh.R
import com.example.prateek.swoosh.model.Player
import com.example.prateek.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    lateinit var player: Player

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)



        player = intent.getParcelableExtra(EXTRA_PLAYER)

        finishBtn.setOnClickListener() {

            if(player.skill != "") {
                val finishIntent = Intent(this, finishActivity::class.java)
                finishIntent.putExtra(EXTRA_PLAYER, player)
                startActivity(finishIntent)
            } else {
                Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
            }

        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)

        if(savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }

    }


    fun onBeginnerBtnClicked(view: View) {
        ballerSkillBtn.isChecked = false
        player.skill = "beginner"
    }

    fun onBallerBtnClicked(view: View) {
        beginnerSkillBtn.isChecked = false
        player.skill = "baller"
    }
}
