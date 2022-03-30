package com.example.myapp.first;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.myapp.R;
import com.example.myapp.catalog.CatalogAccessories;
import com.example.myapp.catalog.CatalogClothes;
import com.example.myapp.catalog.CatalogHelmetsMasks;
import com.example.myapp.catalog.CatalogSki;
import com.example.myapp.catalog.CatalogSnowboards;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    Button buttonTagCatalog;
    Button buttonTagSki;
    Button buttonTagSnowboard;
    Button buttonTagClothes;
    Button buttonTagHelmetsMasks;
    Button buttonTagAccessories;

    ImageButton adsView1;
    ImageButton adsView2;
    ImageButton adsView3;
    ImageButton adsView4;

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonTagSki = findViewById(R.id.button_tag_ski);
        buttonTagSnowboard = findViewById(R.id.button_tag_snowboards);
        buttonTagCatalog = findViewById(R.id.button_tag_catalog);
        buttonTagAccessories = findViewById(R.id.button_tag_accessories);
        buttonTagClothes = findViewById(R.id.button_tag_clothes);
        buttonTagHelmetsMasks = findViewById(R.id.button_tag_helmets_masks);

        adsView1 = findViewById(R.id.ads1);
        adsView2 = findViewById(R.id.ads2);
        adsView3 = findViewById(R.id.ads3);
        adsView4 = findViewById(R.id.ads4);

        String url1="https://firebasestorage.googleapis.com/v0/b/snowpa" +
                "th-3c582.appspot.com/o/main_ads%2FadsBase.jpeg?alt=media" +
                "&token=e15c61e3-7bbc-4e1d-867a-fdc0446aa9ea";

        String url2="https://firebasestorage.googleapis.com/v0/b/snowpath-3c58" +
                "2.appspot.com/o/main_ads%2FnideckerSnowboards.jpg?alt=media&tok" +
                "en=8f9b5f19-b41b-409a-b455-5ecb37faf911";

        String url3="https://firebasestorage.googleapis.com/v0/b/snowpath-3" +
                "c582.appspot.com/o/main_ads%2FadsCapita.jpg?alt=media&token=26" +
                "abe72e-1118-4070-919f-f75b720e68bd";

        String url4="https://firebasestorage.googleapis.com/v0/b/snowpath-3" +
                "c582.appspot.com/o/main_ads%2FhmMan.jpeg?alt=media&token=66a" +
                "56991-47ea-49de-a523-b14bf30a3b6b";

        Glide.with(getApplicationContext()).load(url1).into(adsView1);
        Glide.with(getApplicationContext()).load(url2).into(adsView2);
        Glide.with(getApplicationContext()).load(url3).into(adsView3);
        Glide.with(getApplicationContext()).load(url4).into(adsView4);

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

        buttonTagClothes.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openCatalogClothes();
            }
        });

        buttonTagHelmetsMasks.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openCatalogHelmets();
            }
        });

        buttonTagAccessories.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openCatalogAccessories();
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
    public void openCatalogClothes(){
        Intent intent = new Intent(this, CatalogClothes.class);
        startActivity(intent);
    }
    public void openCatalogHelmets(){
        Intent intent = new Intent(this, CatalogHelmetsMasks.class);
        startActivity(intent);
    }
    public void openCatalogAccessories(){
        Intent intent = new Intent(this, CatalogAccessories.class);
        startActivity(intent);
    }


}