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

public class CatalogHelmetsMasks extends AppCompatActivity {

    ImageView masksView;
    ImageView helmetsView;
    ImageView accessoriesView;

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog_helmets_masks);

        masksView = findViewById(R.id.view_hm_masks);
        helmetsView = findViewById(R.id.view_hm_helmets);
        accessoriesView = findViewById(R.id.view_hm_accessories);

        bottomNavigationView = findViewById(R.id.BottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.catalog);

        String url1="https://firebasestorage.googleapis.com/v0/b/snowpath-3c582.appspo" +
                "t.com/o/catalog_hm%2Fhm_masks_catalog.png?alt=media&token=ab3eb1b4-ef" +
                "17-405e-9c92-bf1862c9c80c";

        String url2="https://firebasestorage.googleapis.com/v0/b/snowpath-3c582.apps" +
                "pot.com/o/catalog_hm%2Fhm_helmets_catalog.png?alt=media&token=4411d2a" +
                "d-7529-4c84-9cad-8a75c07bb475";

        String url3="https://firebasestorage.googleapis.com/v0/b/snowpath-3c582.appsp" +
                "ot.com/o/catalog_hm%2Fhm_accessories_catalog.png?alt=media&token=30ee3" +
                "61c-4e17-489f-85f8-7da3c46bd3af";

        Glide.with(getApplicationContext()).load(url1).into(masksView);
        Glide.with(getApplicationContext()).load(url2).into(helmetsView);
        Glide.with(getApplicationContext()).load(url3).into(accessoriesView);

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