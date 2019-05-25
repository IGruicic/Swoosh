package com.ig_.swoosh

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClc(view: View){
        womensLeagueBtn.isChecked=false
        coedLeagueBtn.isChecked= false
        selectedLeague = "mens"
    }
    fun onWomensClc(view: View){
        mensLeagueBtn.isChecked=false
        coedLeagueBtn.isChecked=false
        selectedLeague="womens"
    }

    fun onedClc(view: View){
        mensLeagueBtn.isChecked=false
        womensLeagueBtn.isChecked=false
        selectedLeague="co-ed"
    }

    fun leagueNextClc(view: View){
        if(selectedLeague != ""){
        val skillActivity = Intent(this,SkillActivity::class.java)
        skillActivity.putExtra(EXTRA_LEAGUE,selectedLeague)
        startActivity(skillActivity)
        } else{
            Toast.makeText(this, "Please select a league.",Toast.LENGTH_SHORT).show()
        }
    }
}
