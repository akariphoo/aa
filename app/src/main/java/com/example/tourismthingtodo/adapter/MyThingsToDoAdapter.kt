package com.example.tourismthingtodo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tourismthingtodo.R
import com.example.tourismthingtodo.VO.thingstodoVO
import com.example.tourismthingtodo.viewholder.MyThingsToDoViewHolder

class MyThingsToDoAdapter(private val context: Context) : RecyclerView.Adapter<MyThingsToDoViewHolder>() {
    private var things_image :ArrayList<thingstodoVO> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyThingsToDoViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.activity_recycler_things_to_do2,parent,false)
        return MyThingsToDoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return things_image.size
    }

    override fun onBindViewHolder(holder: MyThingsToDoViewHolder, position: Int) {
        holder.bindThings(things_image[position])
    }

    fun bindThings(thingsImage: ArrayList<thingstodoVO>) {
        things_image = thingsImage
    }

}
