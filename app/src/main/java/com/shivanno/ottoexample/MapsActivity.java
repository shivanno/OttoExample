package com.shivanno.ottoexample;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        /*
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);*/
        setUpMapIfNeeded();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (mMap != null) {
                setUpMap();
            }
        }
    }

    private void setUpMap() {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(new LatLng(19.725808, -101.1203826));
        markerOptions.title("IA");
        mMap.addMarker(markerOptions);

        markerOptions = new MarkerOptions();
        markerOptions.position(new LatLng(19.7021347,-101.2009538));
        markerOptions.title("Catedral de Morelia");
        mMap.addMarker(markerOptions);

        markerOptions = new MarkerOptions();
        markerOptions.position(new LatLng(19.7043762,-101.1957087));
        markerOptions.title("Festival Internacional de Cine de Morelia");
        mMap.addMarker(markerOptions);

        markerOptions = new MarkerOptions();
        markerOptions.position(new LatLng(19.7070855,-101.1899056));
        markerOptions.title("Cactux");
        mMap.addMarker(markerOptions);

        markerOptions = new MarkerOptions();
        markerOptions.position(new LatLng(19.7070855,-101.1899056));
        markerOptions.title("Cactux");
        mMap.addMarker(markerOptions);


        onMapReady(mMap);
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
        LatLng sydney = new LatLng(19.7021347,-101.2009538);
        googleMap.addMarker(new MarkerOptions().position(sydney).title("Catedral de Morelia"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        googleMap.animateCamera(CameraUpdateFactory.zoomTo(15.0f));
    }
}
