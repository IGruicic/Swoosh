package com.ig_.swoosh.Controler

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ig_.swoosh.Utilities.EXTRA_LEAGUE
import com.ig_.swoosh.R
import com.ig_.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBeginnerClc(view: View){
        ballerSkillBtn.isChecked=false
        skill = "beginner"
    }
    fun onBallerClc(view: View){
        beginnerSkillBtn.isChecked=false
        skill = "baller"
    }
    fun onSkillFinishClc(view: View){
        if(skill != ""){
        val finishActivity = Intent(this,FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE,league)
            finishActivity.putExtra(EXTRA_SKILL,skill)

        startActivity(finishActivity)}
        else{
            Toast.makeText(this,"Please selevt a skill level.",Toast.LENGTH_SHORT).show()
        }
    }

}


