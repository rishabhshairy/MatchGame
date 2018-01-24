package com.example.rishabh.matchgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        ImageView drag1= (ImageView)findViewById(R.id.option1);
        ImageView drag2= (ImageView)findViewById(R.id.option2);
        ImageView drag3= (ImageView)findViewById(R.id.option3);
        ImageView drag4= (ImageView)findViewById(R.id.option4);
    }
}
