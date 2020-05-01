package com.application.wisatacilacap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.application.wisatacilacap.Kuliner.KulinerBrekecek;
import com.application.wisatacilacap.Kuliner.KulinerLanthing;
import com.application.wisatacilacap.Kuliner.KulinerMendoan;
import com.application.wisatacilacap.Kuliner.KulinerSate;
import com.application.wisatacilacap.Kuliner.KulinerSukun;
import com.application.wisatacilacap.Kuliner.KulinerTengiri;
import com.application.wisatacilacap.Wisata.BentengPendem;
import com.application.wisatacilacap.Wisata.CurugCimendaway;
import com.application.wisatacilacap.Wisata.HutanPayau;
import com.application.wisatacilacap.Wisata.KemitForest;
import com.application.wisatacilacap.Wisata.PantaiWidarapayung;
import com.application.wisatacilacap.Wisata.TelukPenyu;

public class MenuKuliner extends AppCompatActivity {

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_kuliner);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle("Kuliner");
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
                Intent i = new Intent(MenuKuliner.this, KulinerBrekecek.class);
                startActivity(i);
            }
        });

        ImageView btn1 = (ImageView) findViewById(R.id.buttonwisata1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuKuliner.this, KulinerBrekecek.class);
                startActivity(i);
            }
        });

        CardView button2 = (CardView) findViewById(R.id.cardview2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuKuliner.this, KulinerSate.class);
                startActivity(i);
            }
        });

        ImageView btn2 = (ImageView) findViewById(R.id.buttonwisata2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuKuliner.this, KulinerSate.class);
                startActivity(i);
            }
        });

        CardView button3 = (CardView) findViewById(R.id.cardview3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuKuliner.this, KulinerMendoan.class);
                startActivity(i);
            }
        });

        ImageView btn3 = (ImageView) findViewById(R.id.buttonwisata3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuKuliner.this, KulinerMendoan.class);
                startActivity(i);
            }
        });

        CardView button4 = (CardView) findViewById(R.id.cardview4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuKuliner.this, KulinerSukun.class);
                startActivity(i);
            }
        });

        ImageView btn4 = (ImageView) findViewById(R.id.buttonwisata4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuKuliner.this, KulinerSukun.class);
                startActivity(i);
            }
        });

        CardView button5 = (CardView) findViewById(R.id.cardview5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuKuliner.this, KulinerLanthing.class);
                startActivity(i);
            }
        });

        ImageView btn5 = (ImageView) findViewById(R.id.buttonwisata5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuKuliner.this, KulinerLanthing.class);
                startActivity(i);
            }
        });

        CardView button6 = (CardView) findViewById(R.id.cardview6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuKuliner.this, KulinerTengiri.class);
                startActivity(i);
            }
        });

        ImageView btn6 = (ImageView) findViewById(R.id.buttonwisata6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuKuliner.this,  KulinerTengiri.class);
                startActivity(i);
            }
        });
    }
}
