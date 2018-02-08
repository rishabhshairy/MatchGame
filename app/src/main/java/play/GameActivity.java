package play;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rishabh.matchgame.R;

import java.util.Random;

/**
 * Created by Rishabh on 2/8/2018.
 */

public class GameActivity extends AppCompatActivity {
    ImageView drag1,drag2,drag3,drag4,answer1,answer2,answer3,answer4;
    TextView answerText1,answerText2,answerText3,answerText4;
    GridLayout g1,g2;
    private ImageView[] options;
    private ImageView[] answers;
    private TextView[] answerTexts;
    int j;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Intent intent=getIntent();
        int i=intent.getIntExtra("choice",0);
        options=new ImageView[4];
        answerTexts=new TextView[4];
        answers=new ImageView[4];
        Random random=new Random();
        switch (i)
        {
            case 0:j=random.nextInt(3);
                setAnimal(j);

                break;

            case 1:
                break;

            case 3:
                break;

            case 4:
                break;
        }


       //image view  for quiz
        drag1=(ImageView)findViewById(R.id.drag1);
        drag2=(ImageView)findViewById(R.id.drag2);
        drag3=(ImageView)findViewById(R.id.drag3);
        drag4=(ImageView)findViewById(R.id.drag4);

        //answer  image views
        answer1=(ImageView)findViewById(R.id.answer1);
        answer2=(ImageView)findViewById(R.id.answer2);
        answer3=(ImageView)findViewById(R.id.answer3);
        answer4=(ImageView)findViewById(R.id.answer4);

        //text views for answers
        answerText1=(TextView)findViewById(R.id.answerText1);
        answerText2=(TextView)findViewById(R.id.answerText2);
        answerText3=(TextView)findViewById(R.id.answerText3);
        answerText4=(TextView)findViewById(R.id.answerText4);

         options[0]=drag1;
        options[1]=drag2;
        options[2]=drag3;
        options[3]=drag4;
        answers[0]=answer1;
        answers[1]=answer2;
        answers[2]=answer3;
        answers[3]=answer4;
        answerTexts[0]=answerText1;
        answerTexts[1]=answerText2;
        answerTexts[2]=answerText3;
        answerTexts[3]=answerText4;


        g1=(GridLayout)findViewById(R.id.grid1);
        g2=(GridLayout)findViewById(R.id.grid2);

        drag1.setOnTouchListener(new MyOnTouchListener());
        drag2.setOnTouchListener(new MyOnTouchListener());
        drag3.setOnTouchListener(new MyOnTouchListener());
        drag4.setOnTouchListener(new MyOnTouchListener());

        answer1.setOnDragListener(new MyDragListener(this));
        answer2.setOnDragListener(new MyDragListener(this));
        answer3.setOnDragListener(new MyDragListener(this));
        answer4.setOnDragListener(new MyDragListener(this));
    }

  private void setAnimal(int i)
  {
      options[0]=(ImageView)findViewById(R.id.drag1);
      options[1]=(ImageView)findViewById(R.id.drag2);
      options[2]=(ImageView)findViewById(R.id.drag3);
      options[3]=(ImageView)findViewById(R.id.drag4);

      answers[0]=findViewById(R.id.answer2);
      answers[1]=findViewById(R.id.answer1);
      answers[2]=findViewById(R.id.answer4);
      answers[3]=findViewById(R.id.answer3);

      answerTexts[0]=(TextView)findViewById(R.id.answerText2);
      answerTexts[1]=(TextView)findViewById(R.id.answerText1);
      answerTexts[2]=(TextView)findViewById(R.id.answerText4);
      answerTexts[3]=(TextView)findViewById(R.id.answerText3);
      int k;
        int a,b,c,d;
        Random  random=new Random();
      switch (i){
          case 0:
              for (int m=0;m<4;m++)
              {
                  options[m].setImageResource(AnimalList.animals1[m]);
                  options[m].setTag(AnimalList.tags[m]);
              }
              a=random.nextInt(4);
              b=random.nextInt(4);
              c=random.nextInt(4);
              d=random.nextInt(4);

              while (true){
                  if (a!=b && b!=c && c!=d && d!=a && d!=b  && c!=a){
                      answers[a].setTag(AnimalList.tags[a]);
                      answerTexts[a].setText(AnimalList.tags[a]);
                      answers[b].setTag(AnimalList.tags[b]);
                      answerTexts[b].setText(AnimalList.tags[b]);
                      answers[c].setTag(AnimalList.tags[c]);
                      answerTexts[c].setText(AnimalList.tags[c]);
                      answers[d].setTag(AnimalList.tags[d]);
                      answerTexts[d].setText(AnimalList.tags[d]);
                      break;
                  }
                a=random.nextInt(4);
              b=random.nextInt(4);
              c=random.nextInt(4);
              d=random.nextInt(4);

              }
              break;
          case 1:

               for (int m=0;m<4;m++)
              {
                  options[m].setImageResource(AnimalList.animals2[m]);
                  options[m].setTag(AnimalList.tags2[m]);
              }
              a=random.nextInt(4);
              b=random.nextInt(4);
              c=random.nextInt(4);
              d=random.nextInt(4);

              while (true){
                  if (a!=b && b!=c && c!=d && d!=a && d!=b  && c!=a){
                      answers[a].setTag(AnimalList.tags2[a]);
                      answerTexts[a].setText(AnimalList.tags2[a]);
                      answers[b].setTag(AnimalList.tags2[b]);
                      answerTexts[b].setText(AnimalList.tags2[b]);
                      answers[c].setTag(AnimalList.tags2[c]);
                      answerTexts[c].setText(AnimalList.tags2[c]);
                      answers[d].setTag(AnimalList.tags2[d]);
                      answerTexts[d].setText(AnimalList.tags2[d]);
                      break;
                  }
                   a=random.nextInt(4);
              b=random.nextInt(4);
              c=random.nextInt(4);
              d=random.nextInt(4);
              }

              break;
          case 2:
                for (int m=0;m<4;m++)
              {
                  options[m].setImageResource(AnimalList.animals3[m]);
                  options[m].setTag(AnimalList.tags3[m]);
              }
              b=random.nextInt(4);
              a=random.nextInt(4);
              c=random.nextInt(4);
              d=random.nextInt(4);

              while (true){
                  if (a!=b && b!=c && c!=d && d!=a && d!=b && c!=a){
                      Log.i("a",Integer.toString(a));
                      Log.i("b",Integer.toString(b));
                      Log.i("c",Integer.toString(c));
                      Log.i("d",Integer.toString(d));
                      answers[a].setTag(AnimalList.tags3[a]);
                      answerTexts[a].setText(AnimalList.tags3[a]);
                      answers[b].setTag(AnimalList.tags3[b]);
                      answerTexts[b].setText(AnimalList.tags3[b]);
                      answers[c].setTag(AnimalList.tags3[c]);
                      answerTexts[c].setText(AnimalList.tags3[c]);
                      answers[d].setTag(AnimalList.tags3[d]);
                      answerTexts[d].setText(AnimalList.tags3[d]);
                      break;
                  }
                  a=random.nextInt(4);
              b=random.nextInt(4);
              c=random.nextInt(4);
              d=random.nextInt(4);
              }
              break;
      }
  }
  private void setOccupation()
  {

  }

  private void setTransport()
  {

  }

  private void setPlaces()
  {

  }


}
