package com.android.paginationexample.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.paginationexample.R
import com.android.paginationexample.model.StringModel
import com.android.paginationexample.viewmodel.StringViewModel

class StringAdapter(private val viewModel: StringViewModel) : RecyclerView.Adapter<StringViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StringViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return StringViewHolder(view)
    }

    override fun onBindViewHolder(holder: StringViewHolder, position: Int) {
        val model = viewModel.getStrings()[position]
        holder.bind(model)
    }

    override fun getItemCount(): Int {
        return viewModel.getStrings().size
    }
}

class StringViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val textView: TextView = itemView.findViewById(R.id.textView)

    fun bind(model: String) {
        textView.text = model
    }
}