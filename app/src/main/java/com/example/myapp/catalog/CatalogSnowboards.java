package com.example.myapp.catalog;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.myapp.first.AboutUs;
import com.example.myapp.first.Cart;
import com.example.myapp.first.Catalog;
import com.example.myapp.first.Liked;
import com.example.myapp.first.MainActivity;
import com.example.myapp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CatalogSnowboards extends AppCompatActivity {

    ImageView snowboardsView;
    ImageView fixtureView;
    ImageView bootsView;
    ImageView protectionView;

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog_snowboards);

        bottomNavigationView = findViewById(R.id.BottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.catalog);

        snowboardsView = findViewById(R.id.view_snowboard_snowboards);
        fixtureView = findViewById(R.id.view_snowboard_fixture);
        bootsView = findViewById(R.id.view_snowboard_boots);
        protectionView = findViewById(R.id.view_snowboard_protection);

        String url1="https://firebasestorage.googleapis.com/v0/b/snowpath-3c582.appsp" +
                "ot.com/o/catalog_snowboards%2Fsnowboard_snowboards_catalog.png?alt=me" +
                "dia&token=3c350973-50c6-4c6f-a938-37acb63d1653";

        String url2="https://firebasestorage.googleapis.com/v0/b/snowpath-3c582.appspo" +
                "t.com/o/catalog_snowboards%2Fsnowboard_fixture_catalog.png?alt=media" +
                "&token=04444034-29ca-437c-b46e-9a5ac44fcb6d";

        String url3="https://firebasestorage.googleapis.com/v0/b/snowpath-3c582.appspot" +
                ".com/o/catalog_snowboards%2Fsnowboard_boots_catalog.png?alt=media&to" +
                "ken=cee35560-cf50-4c16-8b54-ef9cde19a826";

        String url4="https://firebasestorage.googleapis.com/v0/b/snowpath-3c582.appspot" +
                ".com/o/catalog_snowboards%2Fsnowboard_protection_catalog.png?alt=me" +
                "dia&token=42dd6409-0650-4232-ade8-7abbe4bcc00a";

        Glide.with(getApplicationContext()).load(url1).into(snowboardsView);
        Glide.with(getApplicationContext()).load(url2).into(fixtureView);
        Glide.with(getApplicationContext()).load(url3).into(bootsView);
        Glide.with(getApplicationContext()).load(url4).into(protectionView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.cart:
                        startActivity(new Intent(getApplicationContext(), Cart.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.catalog:
                        startActivity(new Intent(getApplicationContext(), Catalog.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.mainActivity:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.liked:
                        startActivity(new Intent(getApplicationContext(), Liked.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.about_us:
                        startActivity(new Intent(getApplicationContext(), AboutUs.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }

}