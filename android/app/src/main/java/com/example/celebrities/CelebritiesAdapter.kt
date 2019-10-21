package com.example.celebrities

import android.service.autofill.OnClickAction
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.celebrity_holder.view.*

class CelebritiesAdapter(val onItemClicked: (celebrity: Celebrity, holder: CelebrityViewHolder) -> Unit): RecyclerView.Adapter<CelebritiesAdapter.CelebrityViewHolder>(){

    private var celebritiesArray = mutableListOf<Celebrity>()

    fun refresh(celebrities:MutableList<Celebrity>){
        celebritiesArray = celebrities
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CelebrityViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.celebrity_holder, parent, false)
        return CelebrityViewHolder(view)
    }

    override fun getItemCount(): Int {
        return celebritiesArray.size
    }

    override fun onBindViewHolder(holder: CelebrityViewHolder, position: Int) {

        if(position >=0 && position <celebritiesArray.size){

            holder.itemView.textView.text = celebritiesArray[position].nome
            holder.itemView.imageView.setImageResource(celebritiesArray[position].foto)
            holder.itemView.setOnClickListener{
                onItemClicked(celebritiesArray[position], holder)
            }

        }

    }

    class CelebrityViewHolder(view:View): RecyclerView.ViewHolder(view){

    }
}