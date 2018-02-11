package learn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.rishabh.matchgame.R;

import me.relex.circleindicator.CircleIndicator;

public class Learn_Activity extends AppCompatActivity {
    ViewPager viewPager;
    TextView imageText;
    occupationSwip occupation;
    placesSwip places;
    animalSwip animals;
    transportSwip transport;
    CircleIndicator indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_game);

        viewPager=(ViewPager)findViewById(R.id.viewPager);
        indicator=(CircleIndicator)findViewById(R.id.cirIndicator);


        int i;
        Intent intent=getIntent();
        i=intent.getIntExtra("choice",0);
        switch (i)
        {
            //ANIMALS
            case 0:
                animals=new animalSwip(this);
                viewPager.setAdapter(animals);
                 indicator.setViewPager(viewPager);
                animals.notifyDataSetChanged();
                imageText=(TextView)findViewById(R.id.imageText);
                imageText.setVisibility(View.VISIBLE);
                imageText.setText("This is a bird");
                viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                    @Override
                    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                    }

                    @Override
                    public void onPageSelected(int position) {

                        switch (position)
                        {
                            case 0:imageText.setText("This is a bird");
                                break;
                            case 1:imageText.setText("This is a cat");
                                break;
                            case 2:imageText.setText("This is a dog");
                                break;
                            case 3:imageText.setText("This is a elephant");
                                break;
                            case 4:imageText.setText("This is a giraffe");
                                break;
                            case 5:imageText.setText("This is a horse");
                                break;
                            case 6:imageText.setText("This is a lion");
                                break;
                            case 7:imageText.setText("This is a mice");
                                break;
                            case 8:imageText.setText("This is a panda");
                                break;
                            case 9:imageText.setText("This is a Polar bear");
                                break;
                            case 10:imageText.setText("This is a rabbit");
                                break;
                            case 11:imageText.setText("This is a tiger");


                        }
                    }


                    @Override
                    public void onPageScrollStateChanged(int state) {

                    }
                });

                break;
            //places
            /*
            ------------------------------
             */
            case 1:

                places=new placesSwip(this);
                viewPager.setAdapter(places);
                 indicator.setViewPager(viewPager);
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
               indicator.setViewPager(viewPager);
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

                //TRANSPORT

            case 3:
                transport=new transportSwip(this);
                viewPager.setAdapter(transport);
                 indicator.setViewPager(viewPager);
                transport.notifyDataSetChanged();
                imageText=(TextView)findViewById(R.id.imageText);
                imageText.setVisibility(View.VISIBLE);
                imageText.setText("This is a ambulance");
                viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                    @Override
                    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                    }

                    @Override
                    public void onPageSelected(int position) {

                        switch (position)
                        {
                            case 0:imageText.setText("Ambulance");
                                break;
                            case 1:imageText.setText("Autorickshaw");
                                break;
                            case 2:imageText.setText("Boat");
                                break;
                            case 3:imageText.setText("Bus");
                                break;
                            case 4:imageText.setText("Cycle");
                                break;
                            case 5:imageText.setText("Firetruck");
                                break;
                            case 6:imageText.setText("Helicopter");
                                break;
                            case 7:imageText.setText("Horsecart");
                                break;
                            case 8:imageText.setText("Jeep");
                                break;
                            case 9:imageText.setText("Motorbike");
                                break;
                            case 10:imageText.setText("Motorboat");
                                break;
                            case 11:imageText.setText("Scooter");
                                break;
                            case 12:imageText.setText("Ship");
                                break;
                            case 13:imageText.setText("Taxi");
                                break;
                            case 14:imageText.setText("Train");
                                break;


                        }
                    }


                    @Override
                    public void onPageScrollStateChanged(int state) {

                    }
                });
                break;
        }

    }
}
