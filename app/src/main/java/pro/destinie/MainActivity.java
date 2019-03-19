package pro.destinie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private Button topButton;
    private Button bottomButton;
    public TextView storyTextView;
    private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        topButton = findViewById(R.id.buttonTop);
        bottomButton = findViewById(R.id.buttonBottom);
        storyTextView = findViewById(R.id.storyTextView);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1) {
                    storyTextView.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    bottomButton.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }else
                    if(mStoryIndex == 3 || mStoryIndex == 4){
                        topButton.setText("EXIT");
                        topButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                finish();
                            }
                        });
                        bottomButton.setVisibility(View.GONE);
                        storyTextView.setText(R.string.T6_End);
                    }else
                        if(mStoryIndex == 2) {
                            storyTextView.setText(R.string.T3_Story);
                            topButton.setText(R.string.T3_Ans1);
                            bottomButton.setText(R.string.T3_Ans2);
                            mStoryIndex = 4;
                        }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1) {
                    storyTextView.setText(R.string.T2_Story);
                    topButton.setText(R.string.T2_Ans1);
                    bottomButton.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else
                    if(mStoryIndex == 2)
                    {   topButton.setText("EXIT");
                        topButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                finish();
                            }
                        });
                        bottomButton.setVisibility(View.GONE);
                        storyTextView.setText(R.string.T4_End);
                }else
                    if(mStoryIndex == 3 || mStoryIndex == 4){
                        topButton.setText("EXIT");
                        topButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                finish();
                            }
                        });
                        bottomButton.setVisibility(View.GONE);
                        storyTextView.setText(R.string.T5_End);
                    }
            }
        });

    }
}

