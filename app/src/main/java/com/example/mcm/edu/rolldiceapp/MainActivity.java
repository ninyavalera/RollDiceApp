package com.example.mcm.edu.rolldiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView wht = findViewById(R.id.white);
        ImageView rd = findViewById(R.id.red);

        wht.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent white = new Intent(MainActivity.this,Main2Activity.class);
                        startActivity(white);
                    }
                }
        );
        rd.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent red = new Intent(MainActivity.this,Main3Activity.class);
                        startActivity(red);
                    }
                }
        );











    }

}
