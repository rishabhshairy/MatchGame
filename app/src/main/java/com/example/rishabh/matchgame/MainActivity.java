package com.example.rishabh.matchgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private static final String SELECTED_ITEM_POSITION = "ItemPosition";
    ImageView imageView;
    TextView textView;
    ProgressBar progressBar;
    private int mPosition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         imageView=(ImageView)findViewById(R.id.startImage);
         textView=(TextView)findViewById(R.id.waitText);
         progressBar=(ProgressBar)findViewById(R.id.progressBar);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),OptionFragment.class));

            }
        },2000);
    }


}
