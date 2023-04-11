package com.example.homework_1android_2.adapteres

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.homework_1android_2.data.Data
import com.example.homework_1android_2.databinding.ItemBinding

class CommonAdapter(private val onItemClick: (name: Data) -> Unit) :
    RecyclerView.Adapter<CommonAdapter.ViewHolder>() {

    private var list: List<Data> = ArrayList()

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<Data>) {
        this.list = list
        notifyDataSetChanged()
    }

    inner class ViewHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            itemView.setOnClickListener {
                onItemClick(list[adapterPosition])

            }
        }

        fun onBind(data: Data) {
            binding.titleName.text = data.titleName
            binding.image.let { Glide.with(it).load(data.image).into(binding.image) }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }

}