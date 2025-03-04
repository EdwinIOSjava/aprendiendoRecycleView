package com.example.aprendientorecycleview

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aprendientorecycleview.adapter.SuperHeroAdapter

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        initRecyclerView()
        }

    //superHeroProvider.superHeroList
 private  fun initRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.recycleSuperHero)// este era el error , tocaba poner recycler view
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter= SuperHeroAdapter(SuperHeroProvider.superHeroList)

    }


}