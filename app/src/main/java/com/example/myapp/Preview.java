package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Preview extends AppCompatActivity {

    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);

        view = (View) findViewById(R.id.preview_picture);

        view.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                backToInfo();
            }
        });

    }
    public void backToInfo(){
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
    }
}