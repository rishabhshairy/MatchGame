package com.example.rishabh.matchgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class LearnList extends AppCompatActivity {
    ArrayList<String> list;
    ArrayAdapter arrayAdapter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_list);
        listView=(ListView)findViewById(R.id.learnList);
        listView.getBackground().setAlpha(30);
        Toast.makeText(this, "Welcome to Learning Section", Toast.LENGTH_SHORT).show();
        list=new ArrayList<String>();
        list.add("LEARN ABOUT ANIMALS");
        list.add("LEARN ABOUT PUBLIC PLACE");
        list.add("LEARN ABOUT OCCUPATION");
        list.add("LEARN ABOUT TRANSPOTATION");

        arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

    }
}
