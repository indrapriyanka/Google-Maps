package com.example.gmapstest;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;

public class MainActivity extends FragmentActivity
{
	LocationManager lManager;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.acivity);
		
		
		SupportMapFragment sp=(SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.fragment1);
		GoogleMap gMap=sp.getMap();
		
		
		lManager=(LocationManager)getSystemService(Context.LOCATION_SERVICE);
		
		
		 Location l=lManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
		
		double lati=l.getLatitude();
		double longi=l.getLongitude();
		
		
		
		MarkerOptions opt=new MarkerOptions();
		
		opt.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker));   
		
		
		opt.position(new LatLng(lati, longi));
		gMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE); 
		
		
		
		gMap.addMarker(opt);
		
		gMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(lati, longi), 15));  
		
	}	
}