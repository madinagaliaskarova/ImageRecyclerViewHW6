package com.geektech.imagerecyclerviewhw6

import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.nio.InvalidMarkException


class ImageFragment : Fragment() {

    private var list =  arrayListOf<ImageModel>()
    private lateinit var recyclerView : RecyclerView
    private val adapter = ImageAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_image, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.recycler_view)
        loadData()
        recyclerView.adapter = adapter
        adapter.setList(list)
    }

    private fun loadData() {
        list.apply {
            add(ImageModel(R.color.mint, R.color.green, "Food & Drink", "https://cdn-icons-png.flaticon.com/512/854/854914.png"))
            add(ImageModel(R.color.yellow, R.color.dark_yellow, "General Knowledge", "https://https://cdn-icons-png.flaticon.com/512/854/854914.png"))
            add(ImageModel(R.color.blue, R.color.dark_blue, "History", "https://www.pngmart.com/files/19/Geometry-Pattern-PNG-Clipart.png"))
            add(ImageModel(R.color.pink, R.color.red, "Geography", "https://www.pngmart.com/files/7/Geography-PNG-Transparent.png"))
            add(ImageModel(R.color.violet, R.color.dark_violet, "Dances", "https://www.pngmart.com/files/7/Geography-PNG-Transparent.png"))
            add(ImageModel(R.color.peach, R.color.dark_peach, "English", "https://www.pngmart.com/files/19/Geometry-Pattern-PNG-Clipart.png"))
            add(ImageModel(R.color.gray , R.color.dark_gray, "Music", "https://www.pngmart.com/files/19/Geometry-Pattern-PNG-Clipart.png"))
            add(ImageModel(R.color.mint, R.color.green, "Cinema", "https://www.pngmart.com/files/22/Finding-Dory-PNG-Isolated-HD-Pictures.png"))
            add(ImageModel(R.color.yellow, R.color.dark_yellow, "Playlist", "https://www.pngmart.com/files/19/Geometry-Pattern-PNG-Clipart.png"))
            add(ImageModel(R.color.blue, R.color.dark_blue, "Messages", "https://www.pngmart.com/files/19/Geometry-Pattern-PNG-Clipart.png"))

    }
}
    }