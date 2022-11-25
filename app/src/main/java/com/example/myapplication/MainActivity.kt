package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.model.ItemsForList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.songReciclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<ItemsForList>()

        for (i in 0..20){
            data.add(ItemsForList("№ $i Песня $i музыка Шаинского, слова Пляцковского"))
            }
        val adapter = SongListAdapter(data)
        recyclerView.adapter = adapter
    }
}