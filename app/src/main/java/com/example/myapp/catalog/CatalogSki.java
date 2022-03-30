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

public class CatalogSki extends AppCompatActivity {

    ImageView skiView;
    ImageView bootsView;
    ImageView sticksView;
    ImageView fixtureView;

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog_ski);

        skiView = findViewById(R.id.view_ski_skis);
        bootsView = findViewById(R.id.view_ski_boots);
        sticksView = findViewById(R.id.view_ski_sticks);
        fixtureView = findViewById(R.id.view_ski_fixture);

        bottomNavigationView = findViewById(R.id.BottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.catalog);

        String url1="https://firebasestorage.googleapis.com/v0/b/snowpath-3c582.apps" +
                "pot.com/o/catalog_ski%2Fski_ski_catalog.png?alt=media&token=fa3130da" +
                "-8f5d-45cf-8df2-d2321023ce06";

        String url2="https://firebasestorage.googleapis.com/v0/b/snowpath-3c582.appspot.c" +
                "om/o/catalog_ski%2Fski_boots_catalog.png?alt=media&token=5d8b7b01-7715-4" +
                "3fd-8dd8-6e16b19b8274";

        String url3="https://firebasestorage.googleapis.com/v0/b/snowpath-3c582.appspo" +
                "t.com/o/catalog_ski%2Fski_sticks_catalog.png?alt=media&token=5f37c2da-3" +
                "de6-4b10-8f2a-549c014765c3";

        String url4="https://firebasestorage.googleapis.com/v0/b/snowpath-3c582.appspo" +
                "t.com/o/catalog_ski%2Fski_fixture_catalog.png?alt=media&token=62e4a13c" +
                "-f7af-42bb-9732-6c8922e6c1aa";

        Glide.with(getApplicationContext()).load(url1).into(skiView);
        Glide.with(getApplicationContext()).load(url2).into(bootsView);
        Glide.with(getApplicationContext()).load(url3).into(sticksView);
        Glide.with(getApplicationContext()).load(url4).into(fixtureView);

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