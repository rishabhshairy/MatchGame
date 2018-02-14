package com.example.rishabh.matchgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import learn.Learn_Activity;

public class LearnList extends AppCompatActivity {
    ArrayList<MyOptions> list=new ArrayList<>();
    ListView listView;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_list);
        listView=(ListView)findViewById(R.id.learnList);
        listView.getBackground().setAlpha(30);
        Toast.makeText(this, "Welcome to Learning Section", Toast.LENGTH_SHORT).show();
        list.add(new MyOptions("Animals"));
        list.add(new MyOptions("Public Places"));
        list.add(new MyOptions("Occupation"));
        list.add(new MyOptions("Transport"));
        list.add(new MyOptions("Sports"));

        MyCard arrayAdapter=new MyCard(this,R.layout.card_list,list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int item, long id) {
                int i;
                    switch (item)
                    {
                        case 0:i=0;
                            Intent intent=new Intent(getApplicationContext(), Learn_Activity.class);
                            intent.putExtra("choice",i);
                            startActivity(intent);
                            break;
                        case 1:i=1;
                            Intent intent1=new Intent(getApplicationContext(), Learn_Activity.class);
                            intent1.putExtra("choice",i);
                            startActivity(intent1);
                            break;
                        case 2:i=2;
                            Intent intent2=new Intent(getApplicationContext(), Learn_Activity.class);
                            intent2.putExtra("choice",i);
                            startActivity(intent2);
                            break;
                        case 3:i=3;
                            Intent intent3=new Intent(getApplicationContext(), Learn_Activity.class);
                            intent3.putExtra("choice",i);
                            startActivity(intent3);
                            break;
                        case 4:
                            i=4;
                            Intent intent4=new Intent(getApplicationContext(),Learn_Activity.class);
                            intent4.putExtra("choice",i);
                            startActivity(intent4);
                    }
            }
        });

    }
}
