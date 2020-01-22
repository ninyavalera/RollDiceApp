package com.example.mcm.edu.rolldiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {
    public Random RANDOM = new Random(6);
    public ImageView imageView1, imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Button rollDices =  findViewById(R.id.rollDices);
        imageView1 =  findViewById(R.id.imageView1);
        imageView2 =  findViewById(R.id.imageView2);
        final Button bck = findViewById(R.id.back);

        rollDices.setText("Roll Dice");

        bck.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent back = new Intent(Main2Activity.this,MainActivity.class);
                        startActivity(back);
                    }
                }
        );

        rollDices.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rollDices();
                        rollDices2();

                        rollDices.setText("Re-roll");
                    }
                }
        );
    }
    public void rollDices2(){
        int num = RANDOM.nextInt(6)+1;
        switch (num){
            case 1:
                imageView2.setImageResource(R.drawable.dice1);
                Toast.makeText(Main2Activity.this, "You got one.", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                imageView2.setImageResource(R.drawable.dice2);
                Toast.makeText(Main2Activity.this, "You got two.", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                imageView2.setImageResource(R.drawable.dice3);
                Toast.makeText(Main2Activity.this, "You got three.", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                imageView2.setImageResource(R.drawable.dice4);
                Toast.makeText(Main2Activity.this, "You got four.", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                imageView2.setImageResource(R.drawable.dice5);
                Toast.makeText(Main2Activity.this, "You got five.", Toast.LENGTH_SHORT).show();
                break;
            case 6:
                imageView2.setImageResource(R.drawable.dice6);
                Toast.makeText(Main2Activity.this, "You got six.", Toast.LENGTH_SHORT).show();
                break;
        }
    }
    public void rollDices(){
        int num = RANDOM.nextInt(6)+1;
        switch (num){
            case 1:
                imageView1.setImageResource(R.drawable.dice1);
                Toast.makeText(Main2Activity.this, "You got one.", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                imageView1.setImageResource(R.drawable.dice2);
                Toast.makeText(Main2Activity.this, "You got two.", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                imageView1.setImageResource(R.drawable.dice3);
                Toast.makeText(Main2Activity.this, "You got three.", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                imageView1.setImageResource(R.drawable.dice4);
                Toast.makeText(Main2Activity.this, "You got four.", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                imageView1.setImageResource(R.drawable.dice5);
                Toast.makeText(Main2Activity.this, "You got five.", Toast.LENGTH_SHORT).show();
                break;
            case 6:
                imageView1.setImageResource(R.drawable.dice6);
                Toast.makeText(Main2Activity.this, "You got six.", Toast.LENGTH_SHORT).show();
                break;

        }

    }
}
