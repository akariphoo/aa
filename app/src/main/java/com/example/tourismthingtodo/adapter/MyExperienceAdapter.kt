package com.example.tourismthingtodo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tourismthingtodo.R
import com.example.tourismthingtodo.VO.thingstodoVO
import com.example.tourismthingtodo.viewholder.MyExperienceViewholder

class MyExperienceAdapter(private val context: Context) : RecyclerView.Adapter<MyExperienceViewholder>() {
    private var things_image : ArrayList<thingstodoVO> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyExperienceViewholder {
        val view = LayoutInflater.from(context).inflate(R.layout.activity_recycler_things_to_do,parent,false)
        return MyExperienceViewholder(view)
    }

    override fun getItemCount(): Int {
       return things_image.size
    }

    override fun onBindViewHolder(holder: MyExperienceViewholder, position: Int) {
        holder.bindExperience(things_image[position])
    }

    fun bindExperience(thingsImage: ArrayList<thingstodoVO>) {
        things_image = thingsImage
    }

}
