package com.application.wisatacilacap.Maps;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.application.wisatacilacap.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsKulinerTengiri extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_kuliner_tengiri);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-7.6902594,109.0264451);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Mandiri Okey"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 8));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setMapToolbarEnabled(true);

        LatLng sydney1 = new LatLng(-7.7174022,109.026984);
        mMap.addMarker(new MarkerOptions().position(sydney1).title("Kerupuk Tengiri Mr. Mackarel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney1, 8));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setMapToolbarEnabled(true);

        LatLng sydney2 = new LatLng(-7.7346684,109.010909);
        mMap.addMarker(new MarkerOptions().position(sydney2).title("Mino Arto"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney2, 8));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setMapToolbarEnabled(true);
    }
}
