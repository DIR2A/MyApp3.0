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

        jacketsView = findViewById(R.id.view_clothes_jackets);
        hoodiesView = findViewById(R.id.view_clothes_hoodies);
        trousersView = findViewById(R.id.view_clothes_trousers);
        rompersView = findViewById(R.id.view_clothes_rompers);
        layeredView = findViewById(R.id.view_clothes_layered);

        String url1="https://firebasestorage.googleapis.com/v0/b/snowpath-3c582.appspo" +
                "t.com/o/catalog_clothes%2Fclothes_jackets_catalog.png?alt=media&token=" +
                "22454d02-0974-4c3a-bcb6-01d6985a84df";

        String url2="https://firebasestorage.googleapis.com/v0/b/snowpath-3c582.appspot.c" +
                "om/o/catalog_clothes%2Fclothes_hoodies_catalog.png?alt=media&token=0cc86c" +
                "be-9e4e-43ee-90d5-d345c50409f1";

        String url3="https://firebasestorage.googleapis.com/v0/b/snowpath-3c582.appspot.com" +
                "/o/catalog_clothes%2Fclothes_trousers_catalog.png?alt=media&token=41d7be79-" +
                "3f3f-4435-a6ca-6e4765da28de";

        String url4="https://firebasestorage.googleapis.com/v0/b/snowpath-3c582.appspot.com/" +
                "o/catalog_clothes%2Fclothes_rompers_catalog.png?alt=media&token=a744d5d7-c00" +
                "1-402c-87f2-a6ff8ade1d07";

        String url5="https://firebasestorage.googleapis.com/v0/b/snowpath-3c582.appspot.com/o" +
                "/catalog_clothes%2Fclothes_layered_catalog.png?alt=media&token=f8861c33-b467-" +
                "4cef-9119-7dffd67406d9";

        Glide.with(getApplicationContext()).load(url1).into(jacketsView);
        Glide.with(getApplicationContext()).load(url2).into(hoodiesView);
        Glide.with(getApplicationContext()).load(url3).into(trousersView);
        Glide.with(getApplicationContext()).load(url4).into(rompersView);
        Glide.with(getApplicationContext()).load(url5).into(layeredView);




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