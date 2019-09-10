package m.tadg500.moodtrackerv5;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;


/**
/* This Class is used to display a toast message with by his ToastDisplay() method
/*
*/

public class ToastMessage {
    public String mMessage="";

    public void ToastDisplay(String mMessage, Context myContext){
        Toast.makeText(myContext , mMessage, Toast.LENGTH_SHORT).show();
        Log.i("DEBUG", mMessage);
    }

}
