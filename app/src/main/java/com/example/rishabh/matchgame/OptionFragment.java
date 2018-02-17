package com.example.rishabh.matchgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.mikhaellopez.circularimageview.CircularImageView;

/**
 * Created by Rishabh on 1/23/2018.
 */

public class OptionFragment extends AppCompatActivity {
    CircularImageView learn,play;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option_fragment);
        learn= (CircularImageView) findViewById(R.id.learnButton);
        play= (CircularImageView) findViewById(R.id.playButton);

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
            Intent intent=new Intent(getApplicationContext(),PlayList.class);
            startActivity(intent);

            }
        });



    }


}
