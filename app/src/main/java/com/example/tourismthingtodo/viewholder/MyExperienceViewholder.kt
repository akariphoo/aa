package com.example.tourismthingtodo.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.tourismthingtodo.VO.thingstodoVO
import kotlinx.android.synthetic.main.activity_recycler_things_to_do.view.*
import kotlinx.android.synthetic.main.activity_things_to_do.view.*

class MyExperienceViewholder(view : View) : RecyclerView.ViewHolder(view) {
    fun bindExperience(thingsImage: thingstodoVO) {
        itemView.iv_things.setImageResource(thingsImage.image)
        itemView.tv_things.text = thingsImage.name
    }

    init {

    }

}
