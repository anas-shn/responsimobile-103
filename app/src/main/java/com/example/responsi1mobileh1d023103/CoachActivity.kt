package com.example.responsi1mobileh1d023103

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.responsi1mobileh1d023103.databinding.ActivityCoachBinding
import com.example.responsi1mobileh1d023103.viewmodel.CoachViewModal

class CoachActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCoachBinding
    private lateinit var viewModel: CoachViewModal

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityCoachBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        viewModel = ViewModelProvider(this)[CoachViewModal::class.java]
        viewModel.coach.observe(this, Observer { coach ->
            if (coach != null) {
                binding.tvNameCoach.text = coach.name
                binding.tvOldCoach.text = coach.dateOfBirth
                binding.tvNationalCoach.text = coach.nationality
            } else {
                binding.tvNameCoach.text = getString(R.string.no_data)
            }
        })

        viewModel.fetchCoach()
    }
}