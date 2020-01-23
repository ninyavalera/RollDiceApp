package com.example.mcm.edu.rolldiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {
    public Random RANDOM = new Random(6);
    public ImageView imageView1, imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView wht = findViewById(R.id.white);
        ImageView nn = findViewById(R.id.neon);

        wht.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent white = new Intent(Main2Activity.this,Main3Activity.class);
                        startActivity(white);
                    }
                }
        );
        nn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent red = new Intent(Main2Activity.this,Main4Activity.class);
                        startActivity(red);
                    }
                }
        );


    }
}
