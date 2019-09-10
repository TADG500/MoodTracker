

package m.tadg500.moodtrackerv5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private ImageView mSmiley;
    private Button     mCommentaryButton;
    private Button     mHistoricalButton;
    private TextView     mDebugText;
    public static int incre = 0;
    ToastMessage myToast = new ToastMessage();
    private String message = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCommentaryButton = (Button) findViewById(R.id.activity_main_comm_btn);
        mHistoricalButton = (Button) findViewById(R.id.activity_main_histo_btn);
        mDebugText = (TextView) findViewById(R.id.activity_main_mood_debugText);
        mCommentaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = ("display commentary pop up");
                myToast.ToastDisplay(message, getApplicationContext());
                mDebugText.setText("Affichage popup Commentaire");
            }
        });
        mHistoricalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = ("display history pop up");
                myToast.ToastDisplay(message, getApplicationContext());
                mDebugText.setText("Affichage popup Historique");
            }
        });
    }



}


