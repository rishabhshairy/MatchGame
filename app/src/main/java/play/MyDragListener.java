package play;

import android.content.Context;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Rishabh on 2/8/2018.
 */

public class MyDragListener implements View.OnDragListener {

    private Context context;

    public MyDragListener(Context c) {
        this.context=c;
    }

    @Override
    public boolean onDrag(View view, DragEvent motionEvent) {

        int k=motionEvent.getAction();
        switch (k)
        {
                 case DragEvent.ACTION_DRAG_STARTED:
                        break;
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
                            Toast.makeText(context, "Correct!!", Toast.LENGTH_SHORT).show();

                        }
                        else
                        {
                            Toast.makeText(context, "Please try Again!! :((", Toast.LENGTH_SHORT).show();
                        }
                        break;
                    case DragEvent.ACTION_DRAG_ENDED:
                        break;
                     default:break;
        }
         return true;
    }
}
