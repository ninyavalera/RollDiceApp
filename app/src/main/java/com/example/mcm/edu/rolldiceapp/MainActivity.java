package com.example.mcm.edu.rolldiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button startB = findViewById(R.id.playb);

        ImageView lg = findViewById(R.id.logo);

        lg.setImageResource(R.drawable.logo);

        startB.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent st = new Intent(MainActivity.this, Main2Activity.class);
                        startActivity(st);
                    }
                }
        );

    }
}
