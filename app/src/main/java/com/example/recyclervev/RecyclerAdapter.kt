package com.example.recyclervev

import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val kahramanlistesi : ArrayList<String>,  val kahramangorsellerı:ArrayList<Bitmap> ) : RecyclerView.Adapter <RecyclerAdapter.SuperKahramanVH> (){

    class SuperKahramanVH (itemView : View ):RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanVH {

        val itemviev= LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return SuperKahramanVH(itemviev)
    }
    override fun onBindViewHolder(holder: SuperKahramanVH, position: Int) {

        holder.itemView.
    }

    override fun getItemCount(): Int {
        return kahramanlistesi.size
    }
}