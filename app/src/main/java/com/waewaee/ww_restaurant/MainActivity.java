package com.waewaee.ww_restaurant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;

import com.waewaee.ww_restaurant.activities.ShopDetailActivity;
import com.waewaee.ww_restaurant.adapters.ShopAdapter;
import com.waewaee.ww_restaurant.delegates.ShopItemDelegate;

public class MainActivity extends AppCompatActivity implements ShopItemDelegate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toolbar toolbar = findViewById(R.id.toolbar);
//        toolbar.setTitle("Discover Restaurants");
//        toolbar.setTitleTextColor(Color.WHITE);
//        setSupportActionBar(toolbar);

        RecyclerView rvShops = findViewById(R.id.rv_shops);
        rvShops.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL, false));

        ShopAdapter adapter = new ShopAdapter(this);
        rvShops.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onTapShop() {
        Intent intent = ShopDetailActivity.newIntent(this);
        startActivity(intent);
    }
}