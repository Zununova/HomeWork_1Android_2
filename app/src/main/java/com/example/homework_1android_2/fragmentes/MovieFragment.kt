package com.example.homework_1android_2.fragmentes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homework_1android_2.adapteres.CommonAdapter
import com.example.homework_1android_2.data.Data
import com.example.homework_1android_2.databinding.FragmentMovieBinding

class MovieFragment : Fragment() {
    private lateinit var binding: FragmentMovieBinding
    private val commonAdapter = CommonAdapter(this::onItemClick)
    private var list: ArrayList<Data> = ArrayList()

    private fun onItemClick(data: Data) {
        findNavController().navigate(
            MovieFragmentDirections.actionMovieFragmentToDetailFragment(
                data
            )
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMovieBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        intializater()
        setData()
    }

    private fun intializater() {
        binding.movieRecyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = commonAdapter
        }
    }

    private fun setData() {

        list.add(
            Data(
                "https://metarankings.ru/images/uploads/Terminator-2-Judgment-Day-2017-cover-100x140.jpg",
                "Терминатор 2: Судный день в 3D,",
                " Фильм «Терминатор 2: Судный день» в 3D (2017) — это обновленная версия с помощью новейших технологий кинопроизводства легендарной ленты на все времена."
            )
        )
        list.add(
            Data(
                "https://avatars.mds.yandex.net/get-kinopoisk-image/1629390/72ba01f5-4cb3-49b6-9dd5-1edffe4411d5/600x900",
                "Безумный Макс: Дорога ярости",
                "Фильм «Безумный Макс: Дорога ярости» — это постапокалиптическая лента от режиссёра Джорджа Миллера, являющаяся уже четвёртой в серии о Максе Рокатански, роль которого исполнит британский актёр Том Харди"
            )
        )
        list.add(
            Data(
                "https://metarankings.ru/images/uploads/Gravity-cover-100x140.png",
                "Гравитация",
                "«Гравитация» — это фильм о выживании, действия которого развиваются в открытом космосе. Он удостоился 7-ми наград премии Оскар в номинациях: режиссера, работы оператора, звука, монтажа, монтажа звука, визуальных эффектов"
            )
        )
        list.add(
            Data(
                "https://metarankings.ru/images/uploads/The-Revenant-cover-100x140.jpg",
                "Выживший",
                "Выживший — это новая историческая драма с Леонардо ДиКаприо в главной роли. Фильм основан на реальных событиях. Охотник Хью Гласс очень серьезно ранен на неизведанных просторах американского Дикого Запада. "

            )
        )
        list.add(
            Data(
                "https://metarankings.ru/images/uploads/edge-of-tomorrow-100x140.png",
                "Грань будущего",
                "Краткое описание: Фильм «Грань будущего» переносит в недалёкое будущее и рассказывает, как раса инопланетян вторгается на Землю. Никакая армия в мире не может остановить их. Майор Уильям Кейдж умирает в бою, но случается невозможное — он оказывается во временной петле. "
            )
        )
        list.add(
            Data(
                "https://metarankings.ru/images/uploads/Kingsman-The-Secret-Service-cover-100x140.jpg",
                "Kingsman: Секретная служба",
                " Фильм «Kingsman: Секретная служба» основанный на некогда популярном комиксе. Он расскажет о секретной шпионской организации. Представитель этой самой организации по имени Джек, агент, берёт под своё крыло племянника Гарри"
            )
        )
        list.add(
            Data(
                "https://metarankings.ru/images/uploads/2014/11/interstellar-cover-art_2-100x140.jpg",
                "Интерстеллар",
                "Фильм «Интерстеллар» повествует о путешествиях группы исследователей, которые используют для этих целей недавно обнаруженный пространственно-временной тоннель, чтобы обойти ограничения полета человека в космическом пространстве"
            )
        )
        list.add(
            Data(
                "https://metarankings.ru/images/uploads/dzhoker-cover-100x140.jpg",
                "Джокер",
                "Фильм «Джокер» — это история одного из самых харизматичных злодеев современной поп-культуры. Он заклятый враг Бэтмена. Вы узнаете историю его становления, становления человека, от которого отвернулось все общество."
            )
        )
        list.add(
            Data(
                "https://metarankings.ru/images/uploads/Paddington-2-cover-100x140.jpg",
                "Приключения Паддингтона 2",
                " Приключения Паддингтона 2 — продолжение успешного фильма приключения медвежонка Паддингтона. Он перебрался из Дремучих местностей далекого Перу в Лондон, в семейство Браунов и продолжает свое незабываемое приключение…"

            )
        )
        list.add(
            Data(
                "https://metarankings.ru/images/uploads/irlandec-cover-100x140.jpg",
                "Ирландец",
                " Фильм «Ирландец» — это остросюжетная история о мафиозном «маляре» килере Фрэнке Ширэне по прозвищу Ирландец, которому приписывают убийство 25 гангстеров, включая самого Джимми Хоффу. В 1950-е он работал простым водителем..."
            )
        )
        commonAdapter.setList(list)
    }
}