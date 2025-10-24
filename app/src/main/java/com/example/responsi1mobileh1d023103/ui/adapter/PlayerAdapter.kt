package com.example.responsi1mobileh1d023103.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.setPadding
import androidx.recyclerview.widget.RecyclerView
import com.example.responsi1mobileh1d023103.data.model.Squad
import com.example.responsi1mobileh1d023103.databinding.ListPlayerBinding

class PlayerAdapter(
    private val onItemClick: (Squad) -> Unit
) : RecyclerView.Adapter<PlayerAdapter.VH>() {

    private val items = mutableListOf<Squad>()

    fun submitList(data: List<Squad>) {
        items.clear()
        items.addAll(data)
        notifyDataSetChanged()
    }

    inner class VH(private val binding: ListPlayerBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(p: Squad) {
            binding.tvNamePlayer.text = p.name
            binding.tvNationality.text = p.nationality
            binding.tvPosition.text = p.position

            // background color by position keyword
            val bg = when {
                p.position.contains("Goalkeeper", true) -> "#FFEB3B" // yellow
                p.position.contains("Defence", true) || p.position.contains("Centre-Back", true) || p.position.contains("Back", true) -> "#2196F3" // blue
                p.position.contains("Midfield", true) -> "#4CAF50" // green
                p.position.contains("Offence", true) || p.position.contains("Forward", true) -> "#F44336" // red
                else -> "#FFFFFF"
            }
            binding.cardViewPlayer.setBackgroundColor(Color.parseColor(bg))
            binding.cardViewPlayer.setPadding(8)

            binding.root.setOnClickListener { onItemClick(p) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListPlayerBinding.inflate(inflater, parent, false)
        return VH(binding)
    }

    override fun onBindViewHolder(holder: VH, position: Int) = holder.bind(items[position])

    override fun getItemCount(): Int = items.size
}