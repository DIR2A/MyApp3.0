package com.example.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.cardview.widget.CardView;

import android.view.View;
import android.view.View.OnClickListener;
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
        Intent intent = new Intent(this,Catalog_Snowboards.class);
        startActivity(intent);
    }

}