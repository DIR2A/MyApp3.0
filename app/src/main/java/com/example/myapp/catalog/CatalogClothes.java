package com.example.myapp.catalog;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import com.example.myapp.first.AboutUs;
import com.example.myapp.first.Cart;
import com.example.myapp.first.Catalog;
import com.example.myapp.first.Liked;
import com.example.myapp.first.MainActivity;
import com.example.myapp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CatalogClothes extends AppCompatActivity {

    ImageView jacketsView;
    ImageView hoodiesView;
    ImageView trousersView;
    ImageView rompersView;
    ImageView layeredView;

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog_clothes);

        bottomNavigationView = findViewById(R.id.BottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.catalog);

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