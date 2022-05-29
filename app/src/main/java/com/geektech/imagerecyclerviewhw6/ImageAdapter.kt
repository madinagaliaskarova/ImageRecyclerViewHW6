package com.geektech.imagerecyclerviewhw6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ImageAdapter : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    private lateinit var list: ArrayList<ImageModel>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_image, parent, false)
        return ImageViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setList(list: ArrayList<ImageModel>) {
        this.list = list
        notifyDataSetChanged()
    }

    inner class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val image: ImageView = itemView.findViewById(R.id.image)
        private val title: TextView = itemView.findViewById(R.id.text_image)
        private val backLayout: ConstraintLayout = itemView.findViewById(R.id.item_image)
        fun bind(imageModel: ImageModel) {
            title.text = imageModel.textTitle
            Glide.with(image).load(imageModel.image).into(image)
            imageModel.backColor?.let { itemView.context.getColor(it) }
                ?.let { backLayout.setBackgroundColor(it) }
            imageModel.bottomColor?.let { itemView.context.getColor(it) }
                ?.let { title.setBackgroundColor(it) }

        }

    }
}