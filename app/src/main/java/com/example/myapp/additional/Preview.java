package com.example.myapp.additional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.myapp.R;
import com.example.myapp.first.AboutUs;

public class Preview extends AppCompatActivity {

    ImageView bg;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);

        bg = findViewById(R.id.preview_picture);
        logo = findViewById(R.id.logo_view);

        String path_logo="https://firebasestorage.googleapis.com/v0/b/snowpath-3c582.appspot.com/o/logo%2Flogo.png?alt=media&token=cce7a1b9-654b-4b95-bf8d-43d0dcdf93d8";


        Glide.with(getApplicationContext()).load(path_logo).into(logo);


        bg.setOnClickListener(new View.OnClickListener(){
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