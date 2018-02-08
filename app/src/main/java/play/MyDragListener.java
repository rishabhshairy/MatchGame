package play;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.DragEvent;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.rishabh.matchgame.R;

/**
 * Created by Rishabh on 2/8/2018.
 */

public class MyDragListener implements View.OnDragListener {

    private Context context;

    GridLayout g1,g2;
    CardView cardView;
    int i=0;
    public MyDragListener(Context c) {
        this.context=c;
    }

    public void showToast(String message)
    {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onDrag(View view, DragEvent motionEvent) {
        g1=(GridLayout)view.findViewById(R.id.grid1);
        g2=(GridLayout)view.findViewById(R.id.grid2);
        cardView=(CardView)view.findViewById(R.id.buttonCard);
        int k=motionEvent.getAction();
        switch (k)
        {
                 case DragEvent.ACTION_DRAG_STARTED:
                        return true;
                    case DragEvent.ACTION_DRAG_ENTERED:
                        break;
                    case DragEvent.ACTION_DRAG_EXITED:
                        break;
                    case DragEvent.ACTION_DROP:
                        View v=(View)motionEvent.getLocalState();
                        ImageView droptarget=(ImageView) view;
                        ImageView option=(ImageView)v;

                        if (droptarget.getTag().toString().equals(option.getTag().toString()))
                        {   i++;
                            droptarget.setImageDrawable(option.getDrawable());
                            option.setVisibility(View.GONE);
                            showToast("correct!!");
                            if (i==4)
                            {
                                g1.setVisibility(View.INVISIBLE);
                                g2.setVisibility(View.INVISIBLE);
                                cardView.setVisibility(View.VISIBLE);
                            }

                        }
                        else
                        {
                           showToast("Incorrect!!");
                        }
                        return true;
                    case DragEvent.ACTION_DRAG_ENDED:
                        break;
                     default:break;
        }
         return true;
    }
}
