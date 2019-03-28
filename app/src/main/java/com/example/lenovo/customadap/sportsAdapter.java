package com.example.lenovo.customadap;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class sportsAdapter extends BaseAdapter {
    String[] vPlayers;
    String[] vCountries;
    String[] vSports;
    Integer[] vImages;
    MainActivity context;
    TextView tv1,tv2,tv3;
    ImageView imageView;

    public sportsAdapter(MainActivity m1, String[] vPlayers, String[] vCountries, String[] vSports, Integer[] vImages) {
        this.vPlayers = vPlayers;
        this.vCountries = vCountries;
        this.vSports = vSports;
        context = m1;
        this.vImages = vImages;
    }

    @Override
    // tells us how many views to created
    public int getCount() {
        return vPlayers.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        convertView = context.getLayoutInflater().inflate(R.layout.customlist,null);
        tv1= (TextView)convertView.findViewById(R.id.textview_1);
        tv2= (TextView)convertView.findViewById(R.id.textview_2);
        tv3= (TextView)convertView.findViewById(R.id.textview_3);
        imageView=(ImageView)convertView.findViewById(R.id.image_view);
        tv1.setText(vPlayers[position]);
        tv2.setText(vCountries[position]);
        tv3.setText(vSports[position]);
        imageView.setImageResource(vImages[position]);
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,vPlayers[position],Toast.LENGTH_SHORT).show();
            }
        });




        return convertView;
    }
}
