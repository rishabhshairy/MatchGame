package com.example.rishabh.matchgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import play.GameActivity;

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
        list.add("Animals");//0
        list.add("Occupation");//1
        list.add("Transportation");//2
        list.add("Public Places");//3
        list.add("Sports");//4
        //setting adapter
        arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

        //setting click listener

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int i=0;
                switch (position)
                {
                    case 0:
                        i=0;
                        Intent intent=new Intent(getApplicationContext(), GameActivity.class);
                        intent.putExtra("choice",i);
                        startActivity(intent);
                        break;

                    case 1:
                        i=1;
                        Intent intent1=new Intent(getApplicationContext(), GameActivity.class);
                        intent1.putExtra("choice",i);
                        startActivity(intent1);
                        break;

                    case 2:
                        i=2;
                        Intent intent2=new Intent(getApplicationContext(), GameActivity.class);
                        intent2.putExtra("choice",i);
                        startActivity(intent2);
                        break;

                    case 3:
                        i=3;
                        Intent intent3=new Intent(getApplicationContext(), GameActivity.class);
                        intent3.putExtra("choice",i);
                        startActivity(intent3);
                        break;

                    case 4:
                        i=4;
                        Intent intent4=new Intent(getApplicationContext(),GameActivity.class);
                        intent4.putExtra("choice",i);
                        startActivity(intent4);
                        break;

                }
            }
        });
    }
}
