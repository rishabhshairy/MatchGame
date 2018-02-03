package com.example.rishabh.matchgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PlayList extends AppCompatActivity {
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list);
        Toast.makeText(this, "Welcome to Game Section", Toast.LENGTH_SHORT).show();
        listView=(ListView)findViewById(R.id.playList);
        listView.getBackground().setAlpha(30);
        //inflating array list
        list=new ArrayList<String>();
        list.add("Animals");
        list.add("Occupation");
        list.add("Transportation");
        list.add("Public Places");
        //setting adapter
        arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

        //setting click listener

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
