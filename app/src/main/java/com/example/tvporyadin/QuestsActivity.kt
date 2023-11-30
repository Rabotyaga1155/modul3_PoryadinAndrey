package com.example.tvporyadin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class QuestsActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quests)
        val rec:RecyclerView = findViewById(R.id.recyclers)
        rec.layoutManager = GridLayoutManager(this,3)
        rec.adapter = QuestRecycler(this,MyObj().list)
    }
}