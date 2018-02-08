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
    ImageView drag1,drag2,drag3,drag4;
    GridLayout g1,g2;
    CardView cardView;
    public MyDragListener(Context c) {
        this.context=c;
    }

    public void showToast(String message)
    {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onDrag(View view, DragEvent motionEvent) {
        int i=0;
        g1=(GridLayout)view.findViewById(R.id.grid1);
        g2=(GridLayout)view.findViewById(R.id.grid2);
        cardView=(CardView)view.findViewById(R.id.buttonCard);
        drag1=(ImageView)view.findViewById(R.id.drag1);
        drag2=(ImageView)view.findViewById(R.id.drag2);
        drag3=(ImageView)view.findViewById(R.id.drag3);
        drag4=(ImageView)view.findViewById(R.id.drag4);
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
                        {
                            droptarget.setImageDrawable(option.getDrawable());
                            option.setVisibility(View.GONE);
                            showToast("correct!!");

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
