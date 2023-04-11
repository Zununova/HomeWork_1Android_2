package com.example.homework_1android_2.fragmentes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homework_1android_2.R
import com.example.homework_1android_2.adapteres.CommonAdapter
import com.example.homework_1android_2.data.Data
import com.example.homework_1android_2.databinding.FragmentMovieBinding
import com.example.homework_1android_2.databinding.FragmentPlanetBinding

class PlanetFragment : Fragment() {

    private lateinit var binding: FragmentPlanetBinding
    private val commonAdapter = CommonAdapter(this::onItemClick)
    private var list: ArrayList<Data> = ArrayList()

    private fun onItemClick(data: Data) {
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPlanetBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        intializater()
        setData()
    }

    private fun intializater() {
        binding.planetRecyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = commonAdapter
        }
    }

    private fun setData() {
        list.add(
            Data(
                "https://spacegid.com/wp-content/uploads/2012/12/Merkuriy-v-tsvete.jpg",
                "Меркурий"
            )
        )
        list.add(
            Data(
                "https://spacegid.com/wp-content/uploads/2013/03/Samaya-yarkaya-planeta-Venera.jpg",
                "Венера"
            )
        )
        list.add(
            Data(
                "https://spacegid.com/wp-content/uploads/2012/12/Zemlya-1024x978.jpg",
                "Земля"
            )
        )
        list.add(
            Data(
                "https://spacegid.com/wp-content/uploads/2014/01/Mars-snimok-kosmicheskogo-teleskopa-Habbl-v-2003-godu.jpg",
                "Марс"
            )
        )
        list.add(
            Data(
                "https://spacegid.com/wp-content/uploads/2013/07/YUpiter-snimok-zonda-Voyadzher-1-1024x770.jpg",
                "Юпитер"
            )
        )
        list.add(
            Data(
                "https://spacegid.com/wp-content/uploads/2013/07/Saturn-snimok-kosmicheskogo-apparata-Kassini-v-2007-godu-1024x374.jpg",
                "Сатурн"
            )
        )
        list.add(
            Data(
                "https://spacegid.com/wp-content/uploads/2014/01/Uran-snimok-Voyadzhera-2-v-1986-godu-963x1024.png",
                "Уран"
            )
        )
        list.add(
            Data(
                "https://spacegid.com/wp-content/uploads/2013/01/Neptun-vid-s-Voyadzhera-2.jpg",
                "Нептун"
            )
        )
        commonAdapter.setList(list)
    }
}