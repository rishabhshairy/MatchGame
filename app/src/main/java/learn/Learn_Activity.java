package learn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.rishabh.matchgame.R;

public class Learn_Activity extends AppCompatActivity {
    ViewPager viewPager;
    TextView imageText;
    occupationSwip occupation;
    placesSwip places;
    animalSwip animals;
    transportSwip transport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_game);

        viewPager=(ViewPager)findViewById(R.id.viewPager);

        int i;
        Intent intent=getIntent();
        i=intent.getIntExtra("choice",0);
        switch (i)
        {
            case 0:break;
            //places
            /*
            ------------------------------
             */
            case 1:

                places=new placesSwip(this);
                viewPager.setAdapter(places);
                places.notifyDataSetChanged();
                imageText=(TextView)findViewById(R.id.imageText);
                imageText.setVisibility(View.VISIBLE);
                 imageText.setText("This is a bank");
              viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                switch (position)
                {
                    case 0:imageText.setText("This is a bank");
                        break;
                    case 1:imageText.setText("This is a Bus Station");
                        break;
                    case 2:imageText.setText("This is a library");
                        break;
                    case 3:imageText.setText("This is a Police Station");
                        break;
                    case 4:imageText.setText("This is a school");
                        break;
                    case 5:imageText.setText("This is a Market Area");
                        break;
                    case 6:imageText.setText("This is a Park");
                        break;
                    case 7:imageText.setText("This is a Post Office");
                        break;
                    case 8:imageText.setText("This is a Restraunt");
                        break;
                    case 9:imageText.setText("This is a Supermarket");
                        break;


                }
            }


            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
                break;
            //occupation
            /*
            ---------------------------------------------------
             */
            case 2:
                imageText=(TextView)findViewById(R.id.imageText);
                imageText.setVisibility(View.INVISIBLE);
                occupation=new occupationSwip(this);
              viewPager.setAdapter(occupation);
              viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position)
                {

                }
            }


            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
                break;


            case 3:break;
        }

    }
}
