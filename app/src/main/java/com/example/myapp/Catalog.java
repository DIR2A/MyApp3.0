package com.example.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.cardview.widget.CardView;

import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Catalog extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    CardView cardViewSnowboards;
    CardView cardViewSki;
    CardView cardViewClothes;
    CardView cardViewHelmets;
    CardView cardViewAccessories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);

        cardViewSnowboards = (CardView)findViewById(R.id.card_view_snowboards);
        cardViewSki = (CardView)findViewById(R.id.card_view_skis);
        cardViewClothes = (CardView)findViewById(R.id.card_view_clothes);
        cardViewHelmets = (CardView)findViewById(R.id.card_view_helmets);
        cardViewAccessories = (CardView)findViewById(R.id.card_view_accessories);

        cardViewSnowboards.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                        openCatalogSnowboards();
                }
        });

        cardViewSki.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openCatalogSki();
            }
        });

        cardViewClothes.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openCatalogClothes();
            }
        });

        cardViewHelmets.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openCatalogHelmets();
            }
        });

        bottomNavigationView = findViewById(R.id.BottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.catalog);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.catalog:
                        return true;

                    case R.id.mainActivity:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
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
    public void openCatalogSnowboards() {
        Intent intent = new Intent(this, CatalogSnowboards.class);
        startActivity(intent);
    }
    public void openCatalogSki() {
        Intent intent = new Intent(this, CatalogSki.class);
        startActivity(intent);
    }
    public void openCatalogClothes() {
        Intent intent = new Intent(this, CatalogClothes.class);
        startActivity(intent);
    }
    public void openCatalogHelmets() {
        Intent intent = new Intent(this, CatalogHelmetsMasks.class);
        startActivity(intent);
    }

}