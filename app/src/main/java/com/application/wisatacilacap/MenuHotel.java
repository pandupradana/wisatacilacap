package com.application.wisatacilacap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.application.wisatacilacap.Hotel.HotelAtrium;
import com.application.wisatacilacap.Wisata.BentengPendem;

public class MenuHotel extends AppCompatActivity {

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_hotel);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle("Hotel");
        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        CardView button1 = (CardView) findViewById(R.id.cardview1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuHotel.this, HotelAtrium.class);
                startActivity(i);
            }
        });

        ImageView btn1 = (ImageView) findViewById(R.id.buttonhotel1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuHotel.this, HotelAtrium.class);
                startActivity(i);
            }
        });

    }
}
