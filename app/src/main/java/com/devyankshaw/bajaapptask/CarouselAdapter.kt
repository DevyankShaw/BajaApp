package com.devyankshaw.bajaapptask

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.recycler_view_layout.view.*

class CarouselAdapter(private val context: Context, private val carouselList: List<CarouselItem>) :
    RecyclerView.Adapter<CarouselAdapter.CarouselViewHolder>(){

    class CarouselViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val carouselImage: ImageView = itemView.carouselImage
        val carouselTitle: TextView = itemView.carouselTitle
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarouselViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_layout,
            parent, false)
        return CarouselViewHolder(itemView)
    }

    override fun getItemCount() = carouselList.size

    override fun onBindViewHolder(holder: CarouselViewHolder, position: Int) {
        val currentItem = carouselList[position]
        Glide.with(context)
            .load(currentItem.imageLink)
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_background)
            .into(holder.carouselImage);
        holder.carouselTitle.text = currentItem.title

        holder.itemView.setOnClickListener {
            context.startActivity(Intent(context, AudioPlayingActivity::class.java))
        }
    }
}