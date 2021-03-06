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

import com.application.wisatacilacap.Maps.MapsHomPremiere;
import com.application.wisatacilacap.Maps.MapsHotelMutiara;
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

public class HotelMutiara extends AppCompatActivity  implements OnMapReadyCallback {

    private GoogleMap mMap;


    CarouselView carouselView, carouselView1, carouselView2;

    int[] images = {R.drawable.hotelmutiara, R.drawable.hotelmutiara1, R.drawable.hotelmutiara2, R.drawable.hotelmutiara3};
    int[] images1 = {R.drawable.superior1, R.drawable.superior2};
    int[] images2 = {R.drawable.deluxe1, R.drawable.deluxe2};

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_mutiara);

        //carouselview
        carouselView = (CarouselView) findViewById(R.id.carouselview);
        carouselView.setPageCount(images.length);
        carouselView.setImageListener(imageListener);

        //carouselview1
        carouselView1 = (CarouselView) findViewById(R.id.carouselview1);
        carouselView1.setPageCount(images1.length);
        carouselView1.setImageListener(imageListener1);

        //carouselview1
        carouselView2 = (CarouselView) findViewById(R.id.carouselview2);
        carouselView2.setPageCount(images2.length);
        carouselView2.setImageListener(imageListener2);

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

        Button btn1 = (Button) findViewById(R.id.buttonmaps1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HotelMutiara.this, MapsHotelMutiara.class);
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
        expTv1.setText(getString(R.string.desc_hotelmutiara));

        // sample code snippet to set the text content on the ExpandableTextView
        ExpandableTextView expTv2 = (ExpandableTextView) findViewById(R.id.expand_text_view1);

        // IMPORTANT - call setText on the ExpandableTextView to set the text content to display
        expTv2.setText(getString(R.string.mutiarasuperior));

        // sample code snippet to set the text content on the ExpandableTextView
        ExpandableTextView expTv3 = (ExpandableTextView) findViewById(R.id.expand_text_view2);

        // IMPORTANT - call setText on the ExpandableTextView to set the text content to display
        expTv3.setText(getString(R.string.mutiaradeluxe));

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
                if (ActivityCompat.checkSelfPermission(HotelMutiara.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-7.709017, 109.019207);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Hotel Mutiara"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 15));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setMapToolbarEnabled(true);
    }
}
