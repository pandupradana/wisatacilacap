package com.application.wisatacilacap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.application.wisatacilacap.Wisata.BentengPendem;
import com.application.wisatacilacap.Wisata.CurugCimendaway;
import com.application.wisatacilacap.Wisata.HutanPayau;
import com.application.wisatacilacap.Wisata.KemitForest;
import com.application.wisatacilacap.Wisata.PantaiWidarapayung;
import com.application.wisatacilacap.Wisata.TelukPenyu;

public class MenuWisata extends AppCompatActivity {

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_wisata);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle("Wisata");
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
                Intent i = new Intent(MenuWisata.this, BentengPendem.class);
                startActivity(i);
            }
        });

        ImageView btn1 = (ImageView) findViewById(R.id.buttonwisata1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuWisata.this, BentengPendem.class);
                startActivity(i);
            }
        });

        CardView button2 = (CardView) findViewById(R.id.cardview2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuWisata.this, TelukPenyu.class);
                startActivity(i);
            }
        });

        ImageView btn2 = (ImageView) findViewById(R.id.buttonwisata2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuWisata.this, TelukPenyu.class);
                startActivity(i);
            }
        });

        CardView button3 = (CardView) findViewById(R.id.cardview3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuWisata.this, KemitForest.class);
                startActivity(i);
            }
        });

        ImageView btn3 = (ImageView) findViewById(R.id.buttonwisata3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuWisata.this, KemitForest.class);
                startActivity(i);
            }
        });

        CardView button4 = (CardView) findViewById(R.id.cardview4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuWisata.this, HutanPayau.class);
                startActivity(i);
            }
        });

        ImageView btn4 = (ImageView) findViewById(R.id.buttonwisata4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuWisata.this, HutanPayau.class);
                startActivity(i);
            }
        });

        CardView button5 = (CardView) findViewById(R.id.cardview5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuWisata.this, CurugCimendaway.class);
                startActivity(i);
            }
        });

        ImageView btn5 = (ImageView) findViewById(R.id.buttonwisata5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuWisata.this, CurugCimendaway.class);
                startActivity(i);
            }
        });

        CardView button6 = (CardView) findViewById(R.id.cardview6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuWisata.this, PantaiWidarapayung.class);
                startActivity(i);
            }
        });

        ImageView btn6 = (ImageView) findViewById(R.id.buttonwisata6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuWisata.this, PantaiWidarapayung.class);
                startActivity(i);
            }
        });

    }
}
