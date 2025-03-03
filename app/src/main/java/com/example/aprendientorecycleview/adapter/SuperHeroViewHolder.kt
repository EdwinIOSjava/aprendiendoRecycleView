package com.example.aprendientorecycleview.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.aprendientorecycleview.R
import com.example.aprendientorecycleview.SuperHero

class SuperHeroViewHolder (view: View): RecyclerView.ViewHolder(view){


    val superHero = view.findViewById<TextView>(R.id.tvSuperHeroName)
    val publisher = view.findViewById<TextView>(R.id.tvPublisher)
    val realName = view.findViewById<TextView>(R.id.tvSuperHeroRealName)
    val photo = view.findViewById<TextView>(R.id.ivSuperHero)


    fun render(superHeroModel: SuperHero){
        superHero.text = superHeroModel.superhero
        realName.text = superHeroModel.realName
        publisher.text = superHeroModel.publisher

    }
}