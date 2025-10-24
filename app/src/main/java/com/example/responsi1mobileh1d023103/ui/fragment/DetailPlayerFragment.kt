package com.example.responsi1mobileh1d023103.ui.fragment

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.responsi1mobileh1d023103.R
import com.example.responsi1mobileh1d023103.databinding.FragmentDetailPlayerBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class DetailPlayerFragment(
    private val name: String,
    private val position: String,
    private val dateOfBirth: String,
    private val nationality: String
) : BottomSheetDialogFragment() {
    private var _binding: FragmentDetailPlayerBinding? = null
    private val binding get() = _binding!!

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.setCancelable(true)
        return dialog
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailPlayerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
    }

    private fun loadData() {
        binding.textViewTitle.text = name
        binding.textViewAuthor.text = position
        binding.textViewYear.text = dateOfBirth
        binding.textViewNationality.text = nationality

        // Load placeholder image with Glide
        Glide.with(this)
            .load(R.drawable.ic_person_24)
            .centerCrop()
            .into(binding.imageViewCover)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}