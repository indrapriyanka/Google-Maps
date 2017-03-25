package com.example.googleplacestest;

import java.util.ArrayList;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter
{
	MainActivity mainActivity;
	ArrayList<MyPOJO> list;
	LayoutInflater inflater;
	
	public MyAdapter(MainActivity mainActivity, ArrayList<MyPOJO> list) {


		this.mainActivity=mainActivity;
		this.list=list;
		this.inflater=LayoutInflater.from(mainActivity);
	} 

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertview, ViewGroup arg2) {
		// TODO Auto-generated method stub
		
		
		convertview=inflater.inflate(R.layout.adapter, null);
		TextView tvName=(TextView)convertview.findViewById(R.id.tvName);
		TextView tvNumber=(TextView)convertview.findViewById(R.id.tvNumber);		
		
		tvName.setText(list.get(position).getName()); 
		tvNumber.setText(list.get(position).getVicinity()); 
		
		
		
		
		
		
		return convertview;
	}

}
