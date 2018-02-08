package play;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rishabh.matchgame.R;

/**
 * Created by Rishabh on 2/8/2018.
 */

public class GameActivity extends AppCompatActivity {
    ImageView drag1,drag2,drag3,drag4,answer1,answer2,answer3,answer4;
    TextView answerText1,answerText2,answerText3,answerText4;
    GridLayout g1,g2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);



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

        ImageView[] options={drag1,drag2,drag3,drag4};
        ImageView[] answers={answer1,answer2,answer3,answer4};

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
}
