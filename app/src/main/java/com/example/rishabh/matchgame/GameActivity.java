package com.example.rishabh.matchgame;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {
    ImageView drag1,drag2,drag3,drag4;
    ImageView answer,answer1,answer2,answer3;
    TextView answerTextView,answerTextView1,answerTextView2,answerTextView3;
    TextView finalText;

    public class MyOnTouchListener implements View.OnTouchListener{

        @RequiresApi(api = Build.VERSION_CODES.N)
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
          if (motionEvent.getAction()==MotionEvent.ACTION_DOWN)
          {
                ClipData data=ClipData.newPlainText("","");
            View.DragShadowBuilder shadowBuilder=new View.DragShadowBuilder(view);
            view.startDrag(data,shadowBuilder,view,0);
            return true;
          }
          else {
              return false;
          }
        }
    }

    public class MyDragListener implements View.OnDragListener
    {

        @Override
        public boolean onDrag(View v, DragEvent dragEvent) {

            switch (dragEvent.getAction())
            {

              case DragEvent.ACTION_DRAG_STARTED:
                        break;
                    case DragEvent.ACTION_DRAG_ENTERED:
                        break;
                    case DragEvent.ACTION_DRAG_EXITED:
                        break;
                    case DragEvent.ACTION_DROP:
                        View view=(View)dragEvent.getLocalState();
                        ImageView droptarget=(ImageView) v;
                        ImageView option=(ImageView)view;

                        if (droptarget.getTag().toString().equals(option.getTag().toString()))
                        {
                            droptarget.setImageDrawable(option.getDrawable());
                            option.setVisibility(View.GONE);
                            Toast.makeText(GameActivity.this, "Correct!!", Toast.LENGTH_SHORT).show();
                                if (drag1.getVisibility()==View.GONE&&
                                drag2.getVisibility()==View.GONE&&
                                drag3.getVisibility()==View.GONE&&
                                drag4.getVisibility()==View.GONE) {
                                    finalText.setVisibility(View.VISIBLE);
                                }
                        }
                        else
                        {
                            Toast.makeText(GameActivity.this, "Please try Again!! :((", Toast.LENGTH_SHORT).show();
                        }
                        break;
                    case DragEvent.ACTION_DRAG_ENDED:
                        break;
                     default:break;

            }


            return true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        drag1 = (ImageView) findViewById(R.id.option1);
        drag2 = (ImageView) findViewById(R.id.option2);
        drag3 = (ImageView) findViewById(R.id.option3);
        drag4 = (ImageView) findViewById(R.id.option4);

        answer = (ImageView) findViewById(R.id.answerImage);
        answer1 = (ImageView) findViewById(R.id.answerImage1);
        answer2 = (ImageView) findViewById(R.id.answerImage2);
        answer3 = (ImageView) findViewById(R.id.answerImage3);

        answerTextView = (TextView) findViewById(R.id.answerText);
        answerTextView1 = (TextView) findViewById(R.id.answerText1);
        answerTextView2 = (TextView) findViewById(R.id.answerText2);
        answerTextView3 = (TextView) findViewById(R.id.answerText3);

        finalText = (TextView) findViewById(R.id.finalText);

        //setting all drag and drop listener

           drag1.setOnTouchListener(new MyOnTouchListener());
           answer.setOnDragListener(new MyDragListener());

           drag2.setOnTouchListener(new MyOnTouchListener());
           answer1.setOnDragListener(new MyDragListener());

           drag3.setOnTouchListener(new MyOnTouchListener());
           answer2.setOnDragListener(new MyDragListener());

           drag4.setOnTouchListener(new MyOnTouchListener());
           answer3.setOnDragListener(new MyDragListener());





    }


}