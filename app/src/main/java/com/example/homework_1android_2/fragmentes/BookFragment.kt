package com.example.homework_1android_2.fragmentes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homework_1android_2.adapteres.CommonAdapter
import com.example.homework_1android_2.data.Data
import com.example.homework_1android_2.databinding.FragmentBookBinding

class BookFragment : Fragment() {

    private lateinit var binding: FragmentBookBinding
    private val commonAdapter = CommonAdapter(this::onItemClick)
    private var list: ArrayList<Data> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBookBinding.inflate(inflater, container, false)
        return binding.root
    }

    private fun onItemClick(data: Data) {
        Toast.makeText(requireContext(), data.titleName, Toast.LENGTH_SHORT).show()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        intializater()
        setData()
    }

    private fun intializater() {
        binding.bookRecyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = commonAdapter
        }
    }

    private fun setData() {
        list.add(
            Data(
                "https://cdn.eksmo.ru/v2/ITD000000001087075/COVER/cover1__w410.webp",
                "Война и мир"
            )
        )
        list.add(
            Data(
                "https://cdn.eksmo.ru/v2/ITD000000000829297/COVER/cover1__w410.webp",
                "Улисс"
            )
        )
        list.add(
            Data(
                "https://cdn.eksmo.ru/v2/ITD000000000840330/COVER/cover1__w410.webp",
                "На маяк"
            )
        )
        list.add(
            Data(
                "https://cdn.eksmo.ru/v2/ITD000000000567667/COVER/cover1__w410.webp",
                "Илиада"
            )
        )
        list.add(
            Data(
                "https://cdn.eksmo.ru/v2/ITD000000000829301/COVER/cover1__w410.webp",
                "Одиссея"
            )
        )
        list.add(
            Data(
                "https://cdn.eksmo.ru/v2/ITD000000001049409/COVER/cover1__w410.webp",
                "Гордость и предубеждение"
            )
        )
        list.add(
            Data(
                "https://cdn.eksmo.ru/v2/ITD000000000593606/COVER/cover1__w410.webp",
                "Путешествия Гулливера"
            )
        )
        list.add(
            Data(
                "https://cdn.eksmo.ru/v2/ITD000000000933825/COVER/cover1__w410.webp",
                "Мидлмарч"
            )
        )
        list.add(
            Data(
                "https://cdn.eksmo.ru/v2/ITD000000001090260/COVER/cover1__w410.webp",
                "Унесенные ветром"
            )
        )
        commonAdapter.setList(list)
    }
}


