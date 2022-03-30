package com.example.myapp.first;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.cardview.widget.CardView;

import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.myapp.R;
import com.example.myapp.catalog.CatalogAccessories;
import com.example.myapp.catalog.CatalogClothes;
import com.example.myapp.catalog.CatalogHelmetsMasks;
import com.example.myapp.catalog.CatalogSki;
import com.example.myapp.catalog.CatalogSnowboards;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Catalog extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    CardView cardViewSnowboards;
    CardView cardViewSki;
    CardView cardViewClothes;
    CardView cardViewHelmets;
    CardView cardViewAccessories;

    ImageView skiView;
    ImageView snowboardView;
    ImageView clothesView;
    ImageView accessoriesView;
    ImageView hmView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);

        cardViewSnowboards = findViewById(R.id.card_view_snowboards);
        cardViewSki = findViewById(R.id.card_view_skis);
        cardViewClothes = findViewById(R.id.card_view_clothes);
        cardViewHelmets = findViewById(R.id.card_view_helmets);
        cardViewAccessories = findViewById(R.id.card_view_accessories);

        skiView = findViewById(R.id.view_ski);
        snowboardView = findViewById(R.id.view_snowboard);
        clothesView = findViewById(R.id.view_clothes);
        accessoriesView = findViewById(R.id.view_accessories);
        hmView = findViewById(R.id.view_hm);

        String url1="https://firebasestorage.googleapis.com/v0/b/snowpath-3c582." +
                "appspot.com/o/general_catalog%2Fex_skis_catalog.png?alt=media&to" +
                "ken=b34f8f84-4c43-476c-b67d-e18e2295cb17";

        String url2="https://firebasestorage.googleapis.com/v0/b/snowpath-3c582.app" +
                "spot.com/o/general_catalog%2Fex_snowboards_catalog.png?alt=media&to" +
                "ken=00f6f90e-777d-4f06-9187-49f92fc413c7";

        String url3="https://firebasestorage.googleapis.com/v0/b/snowpath-3c" +
                "582.appspot.com/o/general_catalog%2Fex_clothes_catalog.png?al" +
                "t=media&token=beb2becb-beb4-40b5-b969-b5c21dc580fa";

        String url4="https://firebasestorage.googleapis.com/v0/b/snowpath-3" +
                "c582.appspot.com/o/general_catalog%2Fex_hm_catalog.png?alt=" +
                "media&token=ee6e8a51-f04a-4415-a227-d498825864e7";

        String url5="https://firebasestorage.googleapis.com/v0/b/snowpath-" +
                "3c582.appspot.com/o/general_catalog%2Fex_accessories_catalog." +
                "png?alt=media&token=ca78c976-dbe3-47b5-9242-59f6daf609f0";

        Glide.with(getApplicationContext()).load(url1).into(skiView);
        Glide.with(getApplicationContext()).load(url2).into(snowboardView);
        Glide.with(getApplicationContext()).load(url3).into(clothesView);
        Glide.with(getApplicationContext()).load(url4).into(hmView);
        Glide.with(getApplicationContext()).load(url5).into(accessoriesView);

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

        cardViewAccessories.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openCatalogAccessories();
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
    public void openCatalogAccessories() {
        Intent intent = new Intent(this, CatalogAccessories.class);
        startActivity(intent);
    }

}