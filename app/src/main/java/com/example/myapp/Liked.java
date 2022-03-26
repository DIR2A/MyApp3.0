package com.example.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Liked extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liked);



        bottomNavigationView = findViewById(R.id.BottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.liked);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.liked:
                        return true;

                    case R.id.catalog:
                        startActivity(new Intent(getApplicationContext(),Catalog.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.cart:
                        startActivity(new Intent(getApplicationContext(),Cart.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.mainActivity:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.about_us:
                        startActivity(new Intent(getApplicationContext(),AboutUs.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}