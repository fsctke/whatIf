package com.example.junkwhatif;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button optionTwo;
        final TextView storyBox;

        final Button optionOne = (Button) findViewById(R.id.option1);
        optionTwo = (Button) findViewById(R.id.option2);
        storyBox = (TextView) findViewById(R.id.storyBox);

        optionOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  Log.d("option1","this is working");
                storyBox.setText(R.string.storyOptionOne);
                optionOne.setText(R.string.button3);
                storyBox.setText(R.string.storyOptionThree);
            }
        });
        optionTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storyBox.setText(R.string.storyOptionTwo);
            }
        });
    }
}
