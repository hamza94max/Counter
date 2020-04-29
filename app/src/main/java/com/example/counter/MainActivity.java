package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

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

                int currentColor = Color.BLACK;//this is activity level variable


                if(counter%33 == 0){
                    currentColor = getRandomColor();//implement getRandomColor() method
                    textView.setTextColor(currentColor);
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




    }

    private int getRandomColor() {

        Random randomcolor = new Random(); // creating Random object
        int[] colors ={Color.YELLOW,Color.CYAN,Color.RED,R.color.orange,R.color.Nile,R.color.Green,Color.BLACK};
       int color = randomcolor.nextInt(colors.length);

        return colors[color];
    }
}







