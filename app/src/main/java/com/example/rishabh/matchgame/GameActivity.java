package com.example.rishabh.matchgame;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {
    ImageView drag1,drag2,drag3,drag4;
    RelativeLayout answer;
    TextView answerTextView;
    RelativeLayout relativeLayout;
    String ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

         drag1= (ImageView)findViewById(R.id.option1);
         drag2= (ImageView)findViewById(R.id.option2);
         drag3= (ImageView)findViewById(R.id.option3);
         drag4= (ImageView)findViewById(R.id.option4);
         answer=(RelativeLayout)findViewById(R.id.answerImage);
         answerTextView=(TextView)findViewById(R.id.answerText);



        answer.setOnDragListener(new View.OnDragListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onDrag(View view, DragEvent dragEvent) {
                Drawable  drawable;
                drawable = getResources().getDrawable(R.drawable.bird);
                int action=dragEvent.getAction();
                switch (action)
                {
                    case DragEvent.ACTION_DRAG_STARTED:
                        break;
                    case DragEvent.ACTION_DRAG_ENTERED:
                        break;
                    case DragEvent.ACTION_DRAG_EXITED:
                        break;
                    case DragEvent.ACTION_DROP:
                        return true;
                    case DragEvent.ACTION_DRAG_ENDED:
                        if (answerTextView.getText().toString().equalsIgnoreCase(drag1.getTag().toString()))
                        {
                            answer.setBackground(drawable);
                            drag1.setVisibility(View.GONE);
                            Toast.makeText(GameActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            Toast.makeText(GameActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
                        }
                     default:break;
                }

                return true;
            }
        });

        drag1.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                ClipData data= ClipData.newPlainText("","");
                View.DragShadowBuilder shadowBuilder=new View.DragShadowBuilder(drag1);
                view.startDrag(data,shadowBuilder,null,0);
                return false;
            }
        });

    }
}