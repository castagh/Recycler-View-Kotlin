package com.example.recyclerview_castagarneta_11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.antman,
                "Ant-Man",
                "Ant-Man is superhero"
            ),
            Superhero(
                R.drawable.black,
                "Batman",
                "Batman is superhero"
            ),
            Superhero(
                R.drawable.captain,
                "Captain America",
                "Captain America is superhero"
            ),
            Superhero(
                R.drawable.gamora,
                "Gamora",
                "Gamora is superhero"
            ),
            Superhero(
                R.drawable.hawkeye,
                "Hawkeye",
                "Hawkeye is superhero"
            ),
            Superhero(
                R.drawable.hulk,
                "Hulk",
                "Hulk is superhero"
            ),
            Superhero(
                R.drawable.iron,
                "Iron Man",
                "Iron Man is a superhero"
            ),
            Superhero(
                R.drawable.loki,
                "Loki",
                "Loki is a superhero"
            ),
            Superhero(
                R.drawable.marvel,
                "Spiderman",
                "Spiderman is a superhero"
            ),
            Superhero(
                R.drawable.nebula,
                "Nebula",
                "Nebula is a superhero"
            ),
            Superhero(
                R.drawable.panter,
                "Black Panter",
                "Black Panter is a superhero"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}