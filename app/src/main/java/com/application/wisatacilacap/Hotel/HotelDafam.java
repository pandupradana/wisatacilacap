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

import com.application.wisatacilacap.Maps.MapsHotelAtrium;
import com.application.wisatacilacap.Maps.MapsHotelDafam;
import com.application.wisatacilacap.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.ms.square.android.expandabletextview.ExpandableTextView;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class HotelDafam extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    CarouselView carouselView,carouselView1,carouselView2,carouselView3;

    int[] images = {R.drawable.hoteldafam, R.drawable.hoteldafam1, R.drawable.hoteldafam2, R.drawable.hoteldafam3};
    int[] images1 = {R.drawable.dafamsuperior1, R.drawable.dafamsuperior2, R.drawable.dafamsuperior3, R.drawable.dafamsuperior4};
    int[] images2 = {R.drawable.dafamdeluxe1, R.drawable.dafamsuperior2, R.drawable.dafamsuperior3, R.drawable.dafamsuperior4};
    int[] images3 = {R.drawable.dafamexecutive1, R.drawable.dafamsuperior2, R.drawable.dafamsuperior3, R.drawable.dafamsuperior4};

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_dafam);

        //carouselview
        carouselView = (CarouselView) findViewById(R.id.carouselview);
        carouselView.setPageCount(images.length);
        carouselView.setImageListener(imageListener);

        //carouselview1
        carouselView1 = (CarouselView) findViewById(R.id.carouselview1);
        carouselView1.setPageCount(images1.length);
        carouselView1.setImageListener(imageListener1);

        //carouselview2
        carouselView2 = (CarouselView) findViewById(R.id.carouselview2);
        carouselView2.setPageCount(images2.length);
        carouselView2.setImageListener(imageListener2);

        //carouselview3
        carouselView3 = (CarouselView) findViewById(R.id.carouselview3);
        carouselView3.setPageCount(images3.length);
        carouselView3.setImageListener(imageListener3);

        ImageListener imageListener = new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(images[position]);
            }
        };

        ImageListener imageListener1 = new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(images1[position]);
            }
        };

        ImageListener imageListener2 = new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(images2[position]);
            }
        };

        ImageListener imageListener3 = new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(images3[position]);
            }
        };

        Button btn1 = (Button) findViewById(R.id.buttonmaps1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HotelDafam.this, MapsHotelDafam.class);
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

        // sample code snippet to set the text content on the ExpandableTextView
        ExpandableTextView expTv1 = (ExpandableTextView) findViewById(R.id.expand_text_view);

        // IMPORTANT - call setText on the ExpandableTextView to set the text content to display
        expTv1.setText(getString(R.string.desc_hoteldafam));

        // sample code snippet to set the text content on the ExpandableTextView
        ExpandableTextView expTv2 = (ExpandableTextView) findViewById(R.id.expand_text_view1);

        // IMPORTANT - call setText on the ExpandableTextView to set the text content to display
        expTv2.setText(getString(R.string.superiordafam));

        // sample code snippet to set the text content on the ExpandableTextView
        ExpandableTextView expTv3 = (ExpandableTextView) findViewById(R.id.expand_text_view2);

        // IMPORTANT - call setText on the ExpandableTextView to set the text content to display
        expTv3.setText(getString(R.string.deluxedafam));

        // sample code snippet to set the text content on the ExpandableTextView
        ExpandableTextView expTv4 = (ExpandableTextView) findViewById(R.id.expand_text_view3);

        // IMPORTANT - call setText on the ExpandableTextView to set the text content to display
        expTv4.setText(getString(R.string.executivedafam));

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
                callIntent.setData(Uri.parse("tel:123"));
                if (ActivityCompat.checkSelfPermission(HotelDafam.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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

    ImageListener imageListener1 = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(images1[position]);

        }
    };

    ImageListener imageListener2 = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(images2[position]);

        }
    };

    ImageListener imageListener3 = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(images3[position]);

        }
    };

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-7.732162, 109.014971);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Hotel Dafam"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 15));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setMapToolbarEnabled(true);
    }
}
