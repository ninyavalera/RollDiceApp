package com.example.mcm.edu.rolldiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import java.util.Random;

public class Main4Activity extends AppCompatActivity {
    public Random RANDOM = new Random(6);
    public ImageView imageView1, imageView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        final Button rollDice =  findViewById(R.id.rollDices);
        imageView1 =  findViewById(R.id.imageView1);
        imageView2 =  findViewById(R.id.imageView2);
        final Button bck = findViewById(R.id.back);

        rollDice.setText("Roll Dice");

        bck.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent back = new Intent(Main4Activity.this,MainActivity.class);
                        startActivity(back);
                    }
                }
        );

        rollDice.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rollDices3();
                        rollDices4();
                        rollDice.setEnabled(false);
                        final Runnable enableButton2 = new Runnable() {
                            @Override
                            public void run() {
                                rollDice.setEnabled(true);
                            }
                        };
                        new Handler().postDelayed(enableButton2,3000);
                    }
                }
        );
        rollDice.setText("Re-roll");
    }
    public void rollDices3(){
        int num = RANDOM.nextInt(6)+1;
        switch (num){
            case 1:
                imageView2.setImageResource(R.drawable.neondice1);
                break;
            case 2:
                imageView2.setImageResource(R.drawable.neondice2);
                break;
            case 3:
                imageView2.setImageResource(R.drawable.neondice3);
                break;
            case 4:
                imageView2.setImageResource(R.drawable.neondice4);
                break;
            case 5:
                imageView2.setImageResource(R.drawable.neondice5);
                break;
            case 6:
                imageView2.setImageResource(R.drawable.neondice6);
                break;
        }
    }
    public void rollDices4(){
        int num = RANDOM.nextInt(6)+1;
        switch (num){
            case 1:
                imageView1.setImageResource(R.drawable.neondice1);
                break;
            case 2:
                imageView1.setImageResource(R.drawable.neondice2);
                break;
            case 3:
                imageView1.setImageResource(R.drawable.neondice3);
                break;
            case 4:
                imageView1.setImageResource(R.drawable.neondice4);
                break;
            case 5:
                imageView1.setImageResource(R.drawable.neondice5);
                break;
            case 6:
                imageView1.setImageResource(R.drawable.neondice6);
                break;
        }
    }
}
