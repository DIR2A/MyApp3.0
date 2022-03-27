package com.example.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    Button buttonTagCatalog;
    Button buttonTagSki;
    Button buttonTagSnowboard;
    Button buttonTagClothes;
    Button buttonTagHelmetsMasks;
    Button buttonTagAccessories;


    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonTagSki = (Button) findViewById(R.id.button_tag_ski);
        buttonTagSnowboard = (Button) findViewById(R.id.button_tag_snowboards);
        buttonTagCatalog = (Button) findViewById(R.id.button_tag_catalog);
        buttonTagAccessories = (Button) findViewById(R.id.button_tag_accessories);
        buttonTagClothes = (Button) findViewById(R.id.button_tag_clothes);
        buttonTagHelmetsMasks = (Button) findViewById(R.id.button_tag_helmets_masks);

        buttonTagCatalog.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openCatalog();
            }
        });

        buttonTagSki.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openCatalogSki();
            }
        });

        buttonTagSnowboard.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openCatalogSnowboards();
            }
        });

        bottomNavigationView = findViewById(R.id.BottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.mainActivity);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.mainActivity:
                        return true;

                    case R.id.catalog:
                        startActivity(new Intent(getApplicationContext(),Catalog.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.cart:
                        startActivity(new Intent(getApplicationContext(),Cart.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.liked:
                        startActivity(new Intent(getApplicationContext(),Liked.class));
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
    public void openCatalog(){
        Intent intent = new Intent(this, Catalog.class);
        startActivity(intent);
    }
    public void openCatalogSki(){
        Intent intent = new Intent(this, CatalogSki.class);
        startActivity(intent);
    }
    public void openCatalogSnowboards(){
        Intent intent = new Intent(this, CatalogSnowboards.class);
        startActivity(intent);
    }


}