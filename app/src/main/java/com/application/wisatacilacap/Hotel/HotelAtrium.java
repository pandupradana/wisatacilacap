package com.application.wisatacilacap.Hotel;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.application.wisatacilacap.Maps.MapsBentengPendem;
import com.application.wisatacilacap.Maps.MapsHotelAtrium;
import com.application.wisatacilacap.R;
import com.application.wisatacilacap.Wisata.BentengPendem;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class HotelAtrium extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    CarouselView carouselView;

    int[] images = {R.drawable.hotelatrium, R.drawable.hotelatrium1, R.drawable.hotelatrium2, R.drawable.hotelatrium3};

    private Toolbar mToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_atrium);

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
                Intent i = new Intent(HotelAtrium.this, MapsHotelAtrium.class);
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
         collapsingToolbarLayout.setTitle("Benteng Pendem");

         collapsingToolbarLayout.setCollapsedTitleTextColor(
         ContextCompat.getColor(this, R.color.white));
         collapsingToolbarLayout.setExpandedTitleColor(
         ContextCompat.getColor(this, R.color.colorPrimary));
         **/

        Button callIntent = (Button) findViewById(R.id.telephone);
        callIntent.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              Intent callIntent = new Intent(Intent.ACTION_CALL);
                                              callIntent.setData(Uri.parse("tel:*123#"));
                                              if (ActivityCompat.checkSelfPermission(HotelAtrium.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                  // TODO: Consider calling
                                                  //    ActivityCompat#requestPermissions
                                                  // here to request the missing permissions, and then overriding
                                                  //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                                  //                                          int[] grantResults)
                                                  // to handle the case where the user grants the permission. See the documentation
                                                  // for ActivityCompat#requestPermissions for more details.
                                                  return;
                                              }
                                              startActivity(callIntent);
                                          }
        });

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
        LatLng sydney = new LatLng(-7.7492326,109.0172697);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Hotel Atrium"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 14));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setMapToolbarEnabled(true);
    }
}