package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val values = arrayListOf("item One", "item two","item three","item four","item five");

        //ListView
        val mlistview = findViewById<ListView>(R.id.list_view);

        //Adapter
        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,values);

        // set Adapter
        mlistview.adapter = adapter

        //Click Item
        mlistview.setOnItemClickListener { parent, view, position, id ->
            if (position == 0){
                openSecondActivity();
            }
            if (position == 1){
                openSecondActivity();
            }
            if (position == 2){
                openSecondActivity();
            }
            if (position == 3){
                openSecondActivity();
            }
            if (position == 4){
                openSecondActivity();
            }
        }

    }
    public fun openSecondActivity (){
        val intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }

}
