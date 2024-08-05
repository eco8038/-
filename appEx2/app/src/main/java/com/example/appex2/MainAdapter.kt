package com.example.appex2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(private val onItemClick: (String) -> Unit) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    private val dataSet = listOf("UI/UX, 디자인 제약에 대해", "안드로이드 개발", "코틀린 프로그래밍")

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_main, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = dataSet[position]
        holder.itemView.setOnClickListener {
            onItemClick(dataSet[position])
        }
    }

    override fun getItemCount() = dataSet.size
}
