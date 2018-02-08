package com.example.rishabh.matchgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import play.GameActivity;

/**
 * Created by Rishabh on 1/23/2018.
 */

public class OptionFragment extends AppCompatActivity {
    ImageButton learn,play;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option_fragment);
        learn= (ImageButton) findViewById(R.id.learnButton);
        play= (ImageButton) findViewById(R.id.playButton);

        learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),LearnList.class);
                startActivity(i);
            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent=new Intent(getApplicationContext(),GameActivity.class);
            startActivity(intent);

            }
        });



    }


}
