package com.example.appdua.modelview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appdua.R
import com.example.appdua.model.Pesan
import com.google.android.material.imageview.ShapeableImageView

class PesanAdapter(private val pesanlist : ArrayList<Pesan>) : RecyclerView.Adapter<PesanAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_toko,parent,false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return pesanlist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = pesanlist[position]
        holder.tvImage.setImageResource(currentItem.image)
        holder.tvHeading.text = currentItem.heading
        holder.tvDeskripsi.text = currentItem.deskripsi
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvImage : ShapeableImageView = itemView.findViewById(R.id.img_pesan)
        val tvHeading : TextView = itemView.findViewById(R.id.tv_JPesan)
        val tvDeskripsi : TextView = itemView.findViewById(R.id.tv_Dpesan)

    }


}