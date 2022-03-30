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

public class CatalogAccessories extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    ImageView backpacksView;
    ImageView bagsView;
    ImageView casesView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog_accessories);

        bottomNavigationView = findViewById(R.id.BottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.catalog);

        backpacksView = findViewById(R.id.view_accessories_backpacks);
        bagsView = findViewById(R.id.view_accessories_bags);
        casesView = findViewById(R.id.view_accessories_cases);

        String url1="https://firebasestorage.googleapis.com/v0/b/snowpath-3c582" +
                ".appspot.com/o/catalog_accessories%2Faccessories_backpack_catalog" +
                ".png?alt=media&token=3914aedb-f010-440a-b5b1-756df438e370";

        String url2="https://firebasestorage.googleapis.com/v0/b/snowpath-3c582.app" +
                "spot.com/o/catalog_accessories%2Faccessories_bags_catalog.png?alt=me" +
                "dia&token=ca0e6b6d-a997-406a-9441-6c4b7ceb6371";

        String url3="https://firebasestorage.googleapis.com/v0/b/snowpath-3c582.appsp" +
                "ot.com/o/catalog_accessories%2Faccessories_cases_catalog.png?alt=medi" +
                "a&token=231325ac-da18-4599-8a46-52835e1cac34";

        Glide.with(getApplicationContext()).load(url1).into(backpacksView);
        Glide.with(getApplicationContext()).load(url2).into(bagsView);
        Glide.with(getApplicationContext()).load(url3).into(casesView);

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