package com.android.paginationexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.paginationexample.view.StringAdapter
import com.android.paginationexample.viewmodel.StringViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel = StringViewModel()
    private val adapter = StringAdapter(viewModel)
    private val layoutManager = LinearLayoutManager(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.init()

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }
}