package com.github.andreysoft.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.github.andreysoft.affirmations.adapter.ItemAdapter
import com.github.andreysoft.affirmations.data.Datasource
import com.github.andreysoft.affirmations.model.Affirmation

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = Datasource().loadAffirmations()
        val recycleView = findViewById<RecyclerView>(R.id.recycler_view)
        recycleView.setHasFixedSize(true)
        recycleView.adapter = ItemAdapter(this, myDataset)

    }
}