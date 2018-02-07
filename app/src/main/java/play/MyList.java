package play;

import com.example.rishabh.matchgame.R;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Rishabh on 2/8/2018.
 */

public class MyList  {
    ArrayList<Integer> animals=new ArrayList<Integer>();
    Integer[] animals1={R.drawable.cat,R.drawable.lion,R.drawable.dog,R.drawable.panda};

    public void add()
    {
        animals.addAll(0, Arrays.asList(animals1));
        System.out.print(animals.get(0));
    }
}
