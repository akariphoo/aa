package com.example.tourismthingtodo

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tourismthingtodo.VO.thingstodoVO
import com.example.tourismthingtodo.adapter.MyExperienceAdapter
import com.example.tourismthingtodo.adapter.MyThingsToDoAdapter
import kotlinx.android.synthetic.main.activity_things_to_do.*

class ThingsToDoActivity:AppCompatActivity() {
    private val experience_image : ArrayList<thingstodoVO> = ArrayList()
    private val things_image : ArrayList<thingstodoVO> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_things_to_do)
        setUpAdapterExperience()
        setUpAdapterThingsToDo()
    }

    private fun setUpAdapterThingsToDo() {
        val adapetr = MyThingsToDoAdapter(this)
        val gm = GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false)
        rv_things_to_do.layoutManager = gm
        rv_things_to_do.adapter = adapetr
        things_image.add(
            thingstodoVO(
                R.drawable.aa,
                "Hot Air"
            )
        )
        things_image.add(
            thingstodoVO(
                R.drawable.aa,
                "Hot Air"
            )
        )
        things_image.add(
            thingstodoVO(
                R.drawable.aa,
                "Hot Air"
            )
        )
        things_image.add(
            thingstodoVO(
                R.drawable.aa,
                "Hot Air"
            )
        )
        things_image.add(
            thingstodoVO(
                R.drawable.aa,
                "Hot Air"
            )
        )
        things_image.add(
            thingstodoVO(
                R.drawable.aa,
                "Hot Air"
            )
        )
        things_image.add(
            thingstodoVO(
                R.drawable.aa,
                "Hot Air"
            )
        )
        things_image.add(
            thingstodoVO(
                R.drawable.aa,
                "Hot Air"
            )
        )
        adapetr.bindThings(things_image)
    }

    private fun setUpAdapterExperience() {
        val adapetr = MyExperienceAdapter(this)
        val lm = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rv_experience.layoutManager = lm
        rv_experience.adapter = adapetr
        experience_image.add(
            thingstodoVO(
                R.drawable.aa,
                "Hot Air"
            )
        )
        experience_image.add(
            thingstodoVO(
                R.drawable.aa,
                "Hot Air"
            )
        )
        experience_image.add(
            thingstodoVO(
                R.drawable.aa,
                "Hot Air"
            )
        )
        experience_image.add(
            thingstodoVO(
                R.drawable.aa,
                "Hot Air"
            )
        )
        adapetr.bindExperience(experience_image)

    }
}