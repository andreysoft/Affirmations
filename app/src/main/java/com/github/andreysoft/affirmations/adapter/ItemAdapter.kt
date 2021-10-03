package com.github.andreysoft.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.DateSorter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.github.andreysoft.affirmations.R
import com.github.andreysoft.affirmations.model.Affirmation

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>()
{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder
    {
        val adapterLayout  = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int)
    {
        val item : Affirmation = dataset[position]
        holder.textview.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    override fun getItemCount() =  dataset.size

    ///
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view)
    {
        val textview: TextView = view.findViewById(R.id.item_title)
        val imageView = view.findViewById<ImageView>(R.id.item_image)

    }

}