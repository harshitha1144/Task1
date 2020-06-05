package com.example.task1

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_task1_2.*

class task1_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task1_2)
        var items =resources.getStringArray(R.array.grocery)
        var arradapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,items)
        mylist.adapter=arradapter
        mylist.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, items[position], Toast.LENGTH_SHORT).show()
        }


    }
}