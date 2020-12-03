package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button rollButton;
ImageView leftDicee,rightDicee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollButton=(Button)findViewById(R.id.roll_button);
        leftDicee=(ImageView)findViewById(R.id.leftdicee);
        rightDicee=(ImageView)findViewById(R.id.rightdicee);
        final int [] diceeArray=
                {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,

                 };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomNumber=new Random();
                int number=randomNumber.nextInt(6);

                leftDicee.setImageResource(diceeArray[number]);


                Random randomNumber1=new Random();
                int number1=randomNumber1.nextInt(6);
                rightDicee.setImageResource(diceeArray[number1]);

            }
        });
    }
}