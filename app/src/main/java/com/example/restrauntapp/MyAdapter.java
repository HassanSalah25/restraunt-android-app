package com.example.restrauntapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
    String names[];
    String phones[];
    Context cm;
    int _layout;
    int image[];

    MyAdapter(String x[], String y[], Context c, int layout, int _image[]){
        names = x;
        phones = y;
        cm = c;
        _layout = layout;
        image = _image;
    }
    @Override
    public int getCount() {
        return names.length;
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
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = LayoutInflater.from(cm).inflate(_layout, parent, false);
        ImageView i = convertView.findViewById(R.id.image);
        i.setImageResource(image[position]);
        TextView x = convertView.findViewById(R.id.name);
        x.setText(names[position]);
        TextView y = convertView.findViewById(R.id.price);
        y.setText(phones[position]);
        return convertView;
    }
}
