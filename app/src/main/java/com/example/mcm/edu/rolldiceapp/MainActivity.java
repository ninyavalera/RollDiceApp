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


        //start diri na page
        ImageView lg = findViewById(R.id.logo);
        //logodiri

        lg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent imagelogo = new Intent(MainActivity.this,Main2Activity.class);
                        startActivity(imagelogo);
                    }
                }
        );


    }

}
