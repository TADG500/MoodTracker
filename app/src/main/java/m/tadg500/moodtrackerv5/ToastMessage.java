package m.tadg500.moodtrackerv5;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;



public class ToastMessage {
    public String mMessage="";

    public void ToastDisplay(String mMessage, Context myContext){
        Toast.makeText(myContext , mMessage, Toast.LENGTH_SHORT).show();
        Log.i("DEBUG", mMessage);
    }

}
