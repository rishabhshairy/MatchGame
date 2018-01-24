package com.example.rishabh.matchgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Rishabh on 1/23/2018.
 */

public class OptionFragment extends AppCompatActivity {
    Button startButton;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option_fragment);
        startButton=(Button)findViewById(R.id.beginButton);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),GameActivity.class);
                startActivity(intent);
            }
        });
    }


}
