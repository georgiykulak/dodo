package com.example.dodo

import android.app.Activity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Button
import android.widget.EditText

class MainActivity : Activity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list_view = findViewById< ListView >(R.id.list_view)
        val add_button = findViewById< Button >(R.id.add_button)
        val edit_text = findViewById< EditText >(R.id.edit_text)

        val adapter = ArrayAdapter< String >(this, android.R.layout.simple_list_item_1)
        list_view.adapter = adapter

        adapter.add("My name is Кулак Георгий Константинович \uD83D\uDC7E")
        edit_text.setText("11")

        add_button.setOnClickListener {
            val text = edit_text.text.toString()
            adapter.add(text)
            adapter.notifyDataSetChanged()
        }
    }
}