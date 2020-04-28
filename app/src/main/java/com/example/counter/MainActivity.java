package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button reset;
    private int counter = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.countertext);
        reset=findViewById(R.id.reset);
        RelativeLayout relativeLayout=findViewById(R.id.reltivee);





        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;


                textView.setText(Integer.toString(counter));

                if (counter >= 0 && counter < 33) {
                    textView.setTextColor(Color.BLACK);
                } else if (counter >= 33 && counter < 66) {
                    //counter is bigger or equal than 33 AND smaller than 66
                    //33, 34, ... 64, 65
                    textView.setTextColor(Color.RED);
                } else if (counter >= 66 && counter < 99) {
                    textView.setTextColor(Color.YELLOW);
                } else if (counter >= 99) {
                    textView.setTextColor(Color.BLUE);
                }

            }
        });



        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                counter = 0;
                textView.setText(Integer.toString(counter));
                textView.setTextColor(Color.BLACK);





            }
        });




    }}







