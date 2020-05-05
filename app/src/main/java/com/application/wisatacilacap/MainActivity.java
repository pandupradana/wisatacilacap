package com.application.wisatacilacap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.application.wisatacilacap.Kuliner.KulinerBrekecek;
import com.application.wisatacilacap.Kuliner.KulinerMendoan;
import com.application.wisatacilacap.Kuliner.KulinerSate;
import com.application.wisatacilacap.Wisata.BentengPendem;
import com.application.wisatacilacap.Wisata.KemitForest;
import com.application.wisatacilacap.Wisata.TelukPenyu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        Button btn1 = (Button) findViewById(R.id.buttonwisata);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MenuWisata.class);
                startActivity(i);
            }
        });

        Button btn2 = (Button) findViewById(R.id.buttonhotel);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MenuHotel.class);
                startActivity(i);
            }
        });

        Button btn3 = (Button) findViewById(R.id.buttonkuliner);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MenuKuliner.class);
                startActivity(i);
            }
        });

        Button btn4 = (Button) findViewById(R.id.buttontentang);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MenuTentang.class);
                startActivity(i);
            }
        });

        //----------------------------------------------------------------------------------------------------/

        CardView btnwisata1 = (CardView) findViewById(R.id.cardviewpendem);
        btnwisata1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, BentengPendem.class);
                startActivity(i);
            }
        });

        ImageView btnwisata11 = (ImageView) findViewById(R.id.imagependem);
        btnwisata11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, BentengPendem.class);
                startActivity(i);
            }
        });

        CardView btnwisata2 = (CardView) findViewById(R.id.cardviewpantai);
        btnwisata2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, TelukPenyu.class);
                startActivity(i);
            }
        });

        ImageView btnwisata22 = (ImageView) findViewById(R.id.imagepantai);
        btnwisata22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, TelukPenyu.class);
                startActivity(i);
            }
        });

        CardView btnwisata3 = (CardView) findViewById(R.id.cardviewkemit);
        btnwisata3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, KemitForest.class);
                startActivity(i);
            }
        });

        ImageView btnwisata33 = (ImageView) findViewById(R.id.imagekemit);
        btnwisata33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, KemitForest.class);
                startActivity(i);
            }
        });

        //--------------------------------------------------------------------------------------/

        CardView btnwisata4 = (CardView) findViewById(R.id.cardviewkuliner1);
        btnwisata4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, KulinerBrekecek.class);
                startActivity(i);
            }
        });

        ImageView btnwisata44 = (ImageView) findViewById(R.id.buttonkuliner1);
        btnwisata44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, KulinerBrekecek.class);
                startActivity(i);
            }
        });

        CardView btnwisata5 = (CardView) findViewById(R.id.cardviewkuliner2);
        btnwisata5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, KulinerSate.class);
                startActivity(i);
            }
        });

        ImageView btnwisata55 = (ImageView) findViewById(R.id.buttonkuliner2);
        btnwisata55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, KulinerSate.class);
                startActivity(i);
            }
        });

        CardView btnwisata6 = (CardView) findViewById(R.id.cardviewkuliner3);
        btnwisata6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, KulinerMendoan.class);
                startActivity(i);
            }
        });

        ImageView btnwisata66 = (ImageView) findViewById(R.id.buttonkuliner3);
        btnwisata66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, KulinerMendoan.class);
                startActivity(i);
            }
        });

    }
}
