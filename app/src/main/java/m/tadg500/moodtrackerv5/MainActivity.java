

package m.tadg500.moodtrackerv5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    //////////////////////  variable : start //////////////////////
        private ImageView mSmiley;
        private Button  mCommentaryButton;
        private Button  mHistoricalButton;
        private TextView mDebugText;
        private ToastMessage myToast = new ToastMessage();
        private String message = "";
    //////////////////////  variable : end  //////////////////////

    //////////////////////  debug variable : start //////////////////////
        public static int incre = 0;
    //////////////////////  debug variable : end  //////////////////////



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //////////////////////  layout connection : start //////////////////////
            mCommentaryButton = (Button) findViewById(R.id.activity_main_comm_btn);
            mHistoricalButton = (Button) findViewById(R.id.activity_main_histo_btn);
            mDebugText = (TextView) findViewById(R.id.activity_main_mood_debugText);
        //////////////////////  layout connection  : end  //////////////////////

        //////////////////////  mCommentaryButton setOnClickListener redefinition : start   //////////////////////
            mCommentaryButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    message = ("display commentary pop up");
                    myToast.ToastDisplay(message, getApplicationContext());
                    mDebugText.setText("Affichage popup Commentaire");
                }
            });
        //////////////////////  mCommentaryButton setOnClickListener redefinition : stop   //////////////////////

        //////////////////////  mHistoricalButton setOnClickListener redefinition : start   //////////////////////
            mHistoricalButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    message = ("display history pop up");
                    myToast.ToastDisplay(message, getApplicationContext());
                    mDebugText.setText("Affichage popup Historique");
                }
            });
        //////////////////////  mHistoricalButton setOnClickListener redefinition : start   //////////////////////
    }



}


