package com.example.restrauntapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

public class GrillActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grill);
        String prices [] = {"150 $","286 $","319 $","180 $", "230 $"};
        String names []= {"Citrus and Garlic Pork Shoulder","North Carolina Pulled Pork","Alton Brown Barbecue Pork Butt","Smoked Char Siu Pork Shoulder Steaks","Smoke-Roasted Sage-Crusted Bone-In Pork Loin"};
        int images [] ={R.drawable.c,R.drawable.n,R.drawable.a,R.drawable.s,R.drawable.sr};
        MyAdapter myadpt = new MyAdapter(names,prices,getApplicationContext(),R.layout.designgrillcard,images);
        ListView list = findViewById(R.id.lv);
        list.setAdapter(myadpt);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent x = new Intent(getApplicationContext(),details.class);
                x.putExtra("image",images[position]);
                x.putExtra("name",names[position]);
                x.putExtra("price",prices[position]);
                startActivity(x);

            }
        });
    }
}