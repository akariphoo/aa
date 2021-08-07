package com.example.tourismthingtodo.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.tourismthingtodo.VO.thingstodoVO
import kotlinx.android.synthetic.main.activity_recycler_things_to_do.view.*

class MyThingsToDoViewHolder(view : View) :RecyclerView.ViewHolder(view) {
    fun bindThings(thingsImage: thingstodoVO) {
        itemView.iv_things.setImageResource(thingsImage.image)
        itemView.tv_things.text = thingsImage.name
    }

    init {

    }
}
