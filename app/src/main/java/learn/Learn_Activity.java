package learn;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rishabh.matchgame.R;

public class Learn_Activity extends AppCompatActivity {
    ViewPager viewPager;
    occupationSwip occupation;

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
            case 1:break;
            case 2:occupation=new occupationSwip(this);
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
