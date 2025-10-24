package com.example.responsi1mobileh1d023103

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.responsi1mobileh1d023103.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initLayout()
        initListener()
    }
    private fun initLayout(){
        binding.layoutClub.let {
            it.imgIcon.setImageResource(R.drawable.ic_ball_24)
            it.tvLayout.setText(R.string.ball_menu)
        }
        binding.layoutCoach.let {
            it.imgIcon.setImageResource(R.drawable.ic_person_24)
            it.tvLayout.setText(R.string.coach_menu)
        }
        binding.layoutSquad.let {
            it.imgIcon.setImageResource(R.drawable.ic_groups_24)
            it.tvLayout.setText(R.string.player_menu)
        }
    }
    private fun initListener() {
        binding.layoutClub.root.setOnClickListener {
            startActivity(Intent(this, HistoryActivity::class.java))
        }

        binding.layoutCoach.root.setOnClickListener {
            startActivity(Intent(this, CoachActivity::class.java))
        }

        binding.layoutSquad.root.setOnClickListener {

            startActivity(Intent(this, PlayerActivity::class.java))
        }

        }
}