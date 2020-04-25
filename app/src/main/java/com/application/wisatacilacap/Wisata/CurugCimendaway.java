package com.application.wisatacilacap.Wisata;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.application.wisatacilacap.Maps.MapsBentengPendem;
import com.application.wisatacilacap.Maps.MapsCurugCimendaway;
import com.application.wisatacilacap.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class CurugCimendaway extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    CarouselView carouselView;

    int[] images = {R.drawable.curugcimendaway, R.drawable.curugcimendaway1, R.drawable.curugcimendaway2, R.drawable.curugcimendaway3};

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curug_cimendaway);

        //carouselview
        carouselView = (CarouselView) findViewById(R.id.carouselview);
        carouselView.setPageCount(images.length);
        carouselView.setImageListener(imageListener);

        ImageListener imageListener = new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(images[position]);
            }
        };

        Button btn1 = (Button) findViewById(R.id.buttonmaps1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CurugCimendaway.this, MapsCurugCimendaway.class);
                startActivity(i);
            }
        });

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        /**CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle("Curug Cimendaway");

        collapsingToolbarLayout.setCollapsedTitleTextColor(
                ContextCompat.getColor(this, R.color.white));
        collapsingToolbarLayout.setExpandedTitleColor(
                ContextCompat.getColor(this, R.color.colorPrimary));
         **/
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(images[position]);

        }
    };

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-7.2177472,108.6084497);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Curug Cimendaway"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 14));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setMapToolbarEnabled(true);
    }
}
