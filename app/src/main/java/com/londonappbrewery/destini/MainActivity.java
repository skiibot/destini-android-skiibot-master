package com.londonappbrewery.destini;

import android.app.VoiceInteractor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button option1Button;
    Button option2Button;
    int mIndex;


    private CYOA[] mPageBank = new CYOA[]{
            new CYOA(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2,1, 2, 3),
            new CYOA(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2, 3, 2,5),
            new CYOA(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2 ,2, 7,6),
            new CYOA(R.string.T4_End,0, R.string.Final, 5),
            new CYOA(R.string.T5_End,0,R.string.Final,6),
            new CYOA(R.string.T6_End,0,R.string.Final,7),

    };

    final int ADVENTURE_LENGTH = mPageBank.length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        option1Button = (Button) findViewById(R.id.buttonTop);
        option2Button = (Button) findViewById(R.id.buttonBottom);

        UpdateGame();


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        option1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Options(true);
                UpdateGame();

            }
        });

        option2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Options(false);
                UpdateGame();
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
    private void Options(boolean choice){
        int pagePass = 1;
        if(choice == true && mPageBank[mIndex].getOption1PageNo() != 0 ){
            while(mPageBank[mIndex].getOption1PageNo() != mPageBank[pagePass].getPageNo()){
            pagePass = pagePass + 1;
            }
            mIndex = pagePass;
        }
        if(choice == false && mPageBank[mIndex].getOption1PageNo() != 0){
            while(mPageBank[mIndex].getOption2PageNo() != mPageBank[pagePass].getPageNo()){
                pagePass = pagePass + 1;
            }
            mIndex = pagePass;
        }
        Log.d("Destini", "mIndex: " + Integer.toString(mIndex));
        Log.d("Destini", "mIndex: " + Integer.toString(mIndex));
    }

    private void UpdateGame(){
        mStoryTextView.setText(mPageBank[mIndex].getStoryid());
        if(mPageBank[mIndex].getOption1id() == 0){
            option1Button.setVisibility(View.GONE);
        }else{
            option1Button.setText(mPageBank[mIndex].getOption1id());
        }
        if(mPageBank[mIndex].getOption2id() == 0){
            option2Button.setVisibility(View.GONE);
        }else{
            option2Button.setText(mPageBank[mIndex].getOption2id());
        }

    }
}
