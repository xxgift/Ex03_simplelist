package com.egco428.ex03_simplelist

import android.app.ListActivity
import android.os.Bundle
import android.widget.ArrayAdapter

class MainActivity : ListActivity() {

    var nameList = arrayOf("Thitawan","Gift","Fon","Mook","Pear","Gifted","Earth","Noon")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,nameList)
        listAdapter = adapter

    }
}
